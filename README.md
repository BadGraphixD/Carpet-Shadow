# Carpet Shadow Mod

This fabric mod allows minecraft players with the lowest permission level to shadow their own player, which is a feature from gnembon's [carpet mod](https://github.com/gnembon/fabric-carpet). To put it simply, this removes the need of running a minecraft client to have a player entity on the server. On a multiplayer server this comes in handy, when players want to afk at a certain location over a longer period of time.

## How it works

The carpet command `/player <name> shadow` shadows the player, and removes the need of an active client. But it's permission level is too high for non-ops. Therefore this mod implements the command `/shadow`, which just executes `/player @s shadow`. This way the command cannot be abused to shadow other players for example.

## How to use

You will require the carpet mod, the fabric api and this mod placed in the mods folder, all of the same version.

## Disclaimer

I have not thoroughly tested this mod and there might be bugs. I cannot assure the safety of the mod.