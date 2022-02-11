package GameEpta;

import GameEpta.weapon.*;

class Player {
    private Weapon[] weaponSlots;

    public Player() {

        weaponSlots = new Weapon[]{
                new Pistol(),
                new Machine(),
                new RPG(),
                new Slingshot(),
                new WaterGun(),

        };

    }


    public int getSlotsCount() {
        return weaponSlots.length;
    }


    public void shotWithWeapons(int slot) {
        if (slot >= weaponSlots.length) {
            System.out.println("Error");
            return;

        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();


    }


}



