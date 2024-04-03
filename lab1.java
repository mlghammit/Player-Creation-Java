/**  */

public class lab1 {

    /**
     * @author Hamza Khamissa CS1027
     * 
     */

    /**
     * PLayer calss represents player on team
     * contains info on player name. position and jersey,
     * class provides methods to get and set player info
     */
    public static class Player{
        private String name;
        private String position;
        private int jerseyNum;

        /* 
        * Constructor creates the given name, position and jersey of the player
        * @param name name of the player in the string
        * @param position position of a player in the string
        * @param jerseyNum jersey number of the player in the data type
        */
        public Player(String name, String position, int jerseyNum) {
            this.name = name;
            this.position = position;
            this.jerseyNum = jerseyNum;

        }

        /* 
         * Returns name fo player
         */
        public String getName() {
            //Get the player's name
            return name;
        }

        /* * 
         * Returns the position of the player
         * 
        */
        public String getPosition() {
            return position;
        }

        /* *
         * Returns the jersey number of the player
         *
         * @return the jersey number of the player
         */
        public int getJerseyNum() {
            return jerseyNum;
        }

        /* *
         * Sets the name of the player.
         * 
         * @param newName the new name of the player
         */
        public void setName(String newName) {
            this.name = newName;
        }

        /* *
         * Sets name of the player
         * 
         * @param newPosition of the new position of player
         */
        public void setPosition(String newPosition) {
            this.position = newPosition;
        }

        /**
         * 
         * Sets new Jersey num
         * 
         * @param newJerseyNum of the nwe position of player
         */
        public void setJerseyNum (int newJerseyNum) {
            this.jerseyNum = newJerseyNum;
        }

        /**
         * Shows relevent information regarding printing p1
         */
        public String toString() {
            return this.name + ": #" + this.jerseyNum;
        }

        /* 
        * This allows our functions to find out if the players are the same or not
         */ 
        public boolean equals(Player other) {
            return this.name.equals(other.name) && this.jerseyNum == other.jerseyNum;
        }

        /* 
         * This is the information of our made up players
         * We provide it with name, position, and Number and it prints out
         * As well determines if same or not
        */
        public static class TestLab {
            public static void main(String[] args) {
                Player p1 = new Player("Hamza", "Defence", 90);
                System.out.println(p1.getName());
                System.out.println(p1.getPosition());
                System.out.println(p1.getJerseyNum());

                p1.setName("Khamissa");
                p1.setPosition("Forward");
                p1.setJerseyNum((69));

                System.out.println(p1.getName());
                System.out.println(p1.getPosition());
                System.out.println(p1.getJerseyNum());

                System.out.println(p1);

                Player p2 = new Player("Khamissa", "Forward", 69);
                
                System.out.println(p2.getName());
                System.out.println(p2.getPosition());
                System.out.println(p2.getJerseyNum());

                if (p1.equals(p2)) {
                    System.out.println("Same player");
                } else {
                    System.out.println("Different Player");
                }
            }
    }
}
}

