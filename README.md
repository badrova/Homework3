# Homework3

        //обработка ошибки при попытке выполнить метод вывода размеров колес автомобилей Мерседес
        //мы не создаем список размеров колес у автомобилей Мерседес
        try {
            mercedesFactory.printWheelSizeList();
        } catch (NullPointerException e) {
            System.out.println("Список доступных размеров колес автомобилей Mercedes не может быть выведен");
        } finally {
            System.out.println();
        }


        MercedesSalon mercedesSalon = new MercedesSalon(mercedesFactory);
        mercedesSalon.changeCarColor(1, "red");
        mercedesFactory.showStorage();
        System.out.println();
        mercedesSalon.orderNewCar(new MercedesCar("M5", 4400, "black"));
        mercedesFactory.showStorage();
        System.out.println();

        //Добавление и удаление опций
        System.out.println("Добавим климат-контроль.");
        mercedesFactory.getMercedesService().addOption(mercedesFactory.getStorehouseCars().get(2), "Seat heater");
        System.out.println("Опция добавлена:");
        mercedesFactory.showStorage();
        mercedesFactory.getMercedesService().removeOption(mercedesFactory.getStorehouseCars().get(2),"Seat heater");
        mercedesFactory.showStorage();
