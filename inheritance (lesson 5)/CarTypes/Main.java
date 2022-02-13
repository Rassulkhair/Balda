package CarTypes;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом

        VehicleAd chevroletAd = new VehicleAd("chevrolet", "666", new PassengerType(),
                new SedanType(), new PetrolType());

        VehicleAd bugattiAd = new VehicleAd("bugatti", "873", new PassengerType(),
                new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[]{chevroletAd, bugattiAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());


    }
}
