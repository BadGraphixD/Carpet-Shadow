package bg.carpet.shadow;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;

public class CarpetShadow implements ModInitializer {
	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
			dispatcher.register(CommandManager.literal("shadow").requires(source -> source.hasPermissionLevel(0)).executes(context -> {

				CommandManager commandManager = context.getSource().getServer().getCommandManager();
				//commandManager.execute(context.getSource().getServer().getCommandSource(), "gamemode creative " + context.getSource().getName());
				commandManager.execute(context.getSource().getServer().getCommandSource(), "player " + context.getSource().getName() + " shadow");
				
				return 1;
			}));
		});
	}
}
