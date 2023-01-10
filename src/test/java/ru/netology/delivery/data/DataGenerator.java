package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import lombok.Data;
import lombok.Value;
import lombok.experimental.UtilityClass;
import lombok.val;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@UtilityClass
public class DataGenerator {

    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity(String locale) {
        Faker faker = new Faker(new Locale(locale));
        List<String> citiesList = Arrays.asList("Абакан",
                "Анадырь",
                "Архангельск",
                "Астрахань",
                "Барнаул",
                "Белгород",
                "Биробиджан",
                "Благовещенск",
                "Брянск",
                "ВеликийНовгород",
                "Владивосток",
                "Владикавказ",
                "Владимир",
                "Волгоград",
                "Вологда",
                "Воронеж",
                "Горно-Алтайск",
                "Грозный",
                "Екатеринбург",
                "Иваново",
                "Ижевск",
                "Иркутск",
                "Йошкар-Ола",
                "Казань",
                "Калининград",
                "Калуга",
                "Кемерово",
                "Киров",
                "Кострома",
                "Краснодар",
                "Красноярск",
                "Курган",
                "Курск",
                "Кызыл",
                "Липецк",
                "Магадан",
                "Магас",
                "Майкоп",
                "Махачкала",
                "Москва",
                "Мурманск",
                "Нальчик",
                "Нарьян-Мар",
                "НижнийНовгород",
                "Новосибирск",
                "Омск",
                "Орёл",
                "Оренбург",
                "Пенза",
                "Пермь",
                "Петрозаводск",
                "Петропавловск-Камчатский",
                "Псков",
                "Ростов-на-Дону",
                "Рязань",
                "Салехард",
                "Самара",
                "Санкт-Петербург",
                "Саранск",
                "Саратов",
                "Севастополь",
                "Симферополь",
                "Смоленск",
                "Ставрополь",
                "Сыктывкар",
                "Тамбов",
                "Тверь",
                "Томск",
                "Тула",
                "Тюмень",
                "Улан-Удэ",
                "Ульяновск",
                "Уфа",
                "Хабаровск",
                "Ханты-Мансийск",
                "Чебоксары",
                "Челябинск",
                "Черкесск",
                "Чита",
                "Элиста",
                "Южно-Сахалинск",
                "Якутск",
                "Ярославль");
        int size = citiesList.size();
        String cit = citiesList.get(faker.number().numberBetween(0,size));

        return cit;
    }


    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale(locale));
        return (faker.name().lastName()) + " " + (faker.name().firstName());
    }

    public static String generatePhone(String locale) {
        Faker faker = new Faker(new Locale(locale));
        return faker.phoneNumber().phoneNumber();
    }


    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {
            Faker faker = new Faker(new Locale(locale));
            return new UserInfo(generateCity(locale),
                    generateName(locale),
                    generatePhone(locale));
        }
    }
}


