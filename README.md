# SpectatorPortals
A simple plugin that allows players to travel through portals while in spectator mode.  
Just drag the jar into your plugins folder and you're good to go.  
No config, no commands, no dependencies, no nothing.

# Why?
- Vanilla doesn't have this built in.
- I have my own SMP where players have the ability to visit the worlds of old seasons, 
 but everytime I want to get anywhere, I only know how to get there using one of the nether highways.
 While I can just go into creative to travel through the nether portals because I'm the server owner, other players can't.
 Plus switching gamemodes constantly gets tiresome.
- It's just plain handy.

# How it works
1. The plugin checks if a spectator is standing in a portal. (This can be a nether portal, end portal, or end gateway)
2. The spectator briefly gets set to creative mode, which allows him to teleport through the portal instantly.
   - While the player is in creative, all his world interactions are disabled for safety.
3. When the player goes through the portal, he gets set back to spectator mode.
   - If the player leaves the portal before the game manages to teleport him, he will still be set back to spectator mode.
4. Once the player leaves the portal on the other side, the cycle begins again

# Bug?
Found a bug? Create an issue on the issue tab.  
(While I've taken extra care to make sure this plugin can't be exploited (since it gives players creative mode),
 just like in Jurassic Park, life finds a way. Besides that, this is still my first plugin I decided to make public, so
 it isn't impossible that there is one)