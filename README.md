# FourSecondMadness

## Raison D'Etre

This game framework was created to teach myself the **model-view-controller (MVC)** architecture paridigm, commonly used in **UI development**. This game framework was created with the intention to have the player to navigate a maze on each level in only four seconds. 

I implemented an adaption of MVP that was right for my level of learning in 2015. The player character and each type of obstruction (wall to block, vines to slow) have a model that stores information of where they are located. They each have a view to describe how they are rendered. The model and the view are constructed within a controller constructor, and only talk to the controller. No other class knows of their existence. The Controller class for the player and each obstacle is constructed, and therefore their life-cycle should be defined by, the Level Controller. This acts as the central handler that the game loop (pseudo UI-thread) uses to render the game. More official MVC would allow the model and view to interact with the rest of the program. They would still not be able to interact with each other except through the controller. 

## Explanation of Game Initialization
The game starts by the Top package's Game.java class. It creates the Window.java class that serves as the game canvas and calls a pseudo UI-thread -- the main runnable that controls the game at 120 fps. It also constructs MainController.java to act as the handler over which the game-loop iterates. This has control of if the player looks at the game screen or the inventory (pause) screen. This enables the player to press Esc on any level to change the view. 

This top-level handler constructs Level1Controller.java. The shop menu, player model, and all terrain associated with level 1 are contained within level 1's handler defined by this class. This was done to allow **scalability with a level-progression system**. When level 1 is complete, a check-point is reached, and the player can be recreated with more in their inventory, i.e., an item to phase through walls. As stated in the Raison D'Etre, the life-cycle of this Level1Controller.java should contain the entire life-cycle of the controller, model, and view for the player and the obstructions (wall to block, vines to slow). 

## Note on Abstract Package and Scalability
The abstracts of the obstruction (wall and vines) model and view abstracts can be found in the Abstract Package. These classes formalize fields such as box dimensions that should be consistent among all current and future obstruction classes. The abstracts which the PlayerModel and PlayerView inherits is found here as LivingModel.java and LivingView.java. This namespace was used to scale to multiple controlled players with the same keys, to add to the maze difficulty. It could also extend to enemies which move in real time, unlike the static obstructions. 

## Note on Inventory Screen
The inventory screen is colored how it is, with the top two buttons in the shop and inventory miscolored, to show that these are intrinsically linked. The classes ItemBag, MyButtonModel, and MyButtonController go with this screen. 
