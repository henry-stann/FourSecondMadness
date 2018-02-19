# FourSecondMadness

## Raison D'Etre

This game framework was created to teach myself the **model-view-controller architecture** pattern -- commonly used in **UI development**. This game framework was created with the intention to have the player to navigate a maze on each level in only four seconds. 

The player character and each type of obstruction (wall to block, vines to slow) have a model that stores information of where they are located. They each have a view to describe how they are rendered. The model and the view are constructed within a controller constructor, and only talk to the controller. Because they are no more than storage units, they are abstract classes. No other class knows of their existence. The Controller class for the player and each obstacle is constructed, and therefore their life-cycle should be defined by, the Level Controller. This acts as the central handler that the game loop (pseudo-UI-thread) uses to render the game. 



## Explanation of Classes


Top Game creates Main Controller Handler. This has control of if the player looks at the game or the Item Bag (pause) menu. This enables the player to press Esc on any level to change the view. Currently the shop menu and level controller

This is where you would **scale** the game to add more levels, and could put level progression into the shop system. 

The game starts by the "Top" package. "Game.java" Creates the Class Window that serves as the game canvas and calls a pseudo UI-thread -- the main runnable that controls the game at 120 fps. This loops through a top-level handler defined by MainController.java. 

This top-level handler contains Level 1. The shop menu, player model, and all terrain associated with level 1 are contained within Level 1's handler. This was done to allow **scalability with a level-progression system**. When level 1 is complete, a check-point is reached, and the player can be recreated with more in their inventory, i.e., an item to phase through walls. 

As stated in the Reason for this Game framework, this Level 1 Controller sets up the controller, model, and view for the player and the obstructions (wall to block,, vines to slow). The player model and view can be found in the "Abstract" package as LivingModel and LivingView. This namespace was used if you want to scale to multiple controlled players, to add to the maze difficulty. The obstruction model and view can be found here as well. The controller is what differentiates how each obstruction (wall, vine) interacts with the player. 


## Note on Inventory Menu
The Inventory screen is colored how it is, with the top two buttons in the shop and inventory mis-colored, to show that these are intrinsically linked. 
The classes ItemBag, MyButtonModel, and MyButtonController go with this menu. 
