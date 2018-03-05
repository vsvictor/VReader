package com.fb2lib.types;

import com.fb2lib.R;

/**
 * Created by victor on 05.03.18.
 */

public enum Genre {sf_history("sf_history", R.string.sf_history), sf_action("sf_action",R.string.sf_action);
    private String fb2Notation;
    private int humanNotation;

    private Genre(String fb2Notation, int humanNotation){
        this.fb2Notation = fb2Notation;
        this.humanNotation = humanNotation;
    }
}
/*
sf_history              Альтернативная история
sf_action               Боевая Фантастика
sf_epic                 Эпическая Фантастика
sf_heroic               Героическая фантастика
sf_detective            Детективная Фантастика
sf_cyberpunk            Киберпанк
sf_space                Космическая Фантастика
sf_social               Социальная фантастика
sf_horror               Ужасы и Мистика
sf_humor                Юмористическая фантастика
sf_fantasy              Фэнтези
sf                      Научная Фантастика
child_sf                Детская Фантастика
det_classic             Классический Детектив
det_police              Полицейский Детектив
det_action              Боевики
det_irony               Иронический Детектив
det_history             Исторический Детектив
det_espionage           Шпионский Детектив
det_crime               Криминальный Детектив
det_political           Политический Детектив
det_maniac              Маньяки
det_hard                Крутой Детектив
thriller                Триллеры
detective               Детектив
sf_detective            Детективная Фантастика
child_det               Детские Остросюжетные
love_detective          Остросюжетные Любовные Романы
prose                   Проза
prose_classic           Классическая Проза
prose_history           Историческая Проза
prose_contemporary      Современная Проза
prose_counter           Контркультура
prose_rus_classic       Русская Классика
prose_su_classics       Советская Классика
humor_prose             Юмористическая Проза
child_prose             Детская Проза
love                    Любовные романы
love_contemporary       Современные Любовные Романы
love_history            Исторические Любовные Романы
love_detective          Остросюжетные Любовные Романы
love_short              Короткие Любовные Романы
love_erotica            Эротика
adv_western             Вестерны
adv_history             Исторические Приключения
adv_indian              Приключения: Индейцы
adv_maritime            Морские Приключения
adv_geo                 Путешествия и География
adv_animal              Природа и Животные
adventure               Приключения: Прочее
child_adv               Детские Приключения
children                Детское
child_tale              Сказки
child_verse             Детские Стихи
child_prose             Детская Проза
child_sf                Детская Фантастика
child_det               Детские Остросюжетные
child_adv               Детские Приключения
child_education         Детская Образовательная литература
children                Детское: Прочее
poetry                  Поэзия
dramaturgy              Драматургия
humor_verse             Юмористические Стихи
child_verse             Детские Стихи
antique_ant             Античная Литература
antique_european        Европейская Старинная Литература
antique_russian         Древнерусская Литература
antique_east            Древневосточная Литература
antique_myths           Мифы. Легенды. Эпос
antique                 Старинная Литература: Прочее
sci_history             История
sci_psychology          Психология
sci_culture             Культурология
sci_religion            Религиоведение
sci_philosophy          Философия
sci_politics            Политика
sci_business            Деловая литература
sci_juris               Юриспруденция
sci_linguistic          Языкознание
sci_medicine            Медицина
sci_phys                Физика
sci_math                Математика
sci_chem                Химия
sci_biology             Биология
sci_tech                Технические
science                 Научно-образовательная: Прочее
adv_animal              Природа и Животные
comp_www                Интернет
comp_programming        Программирование
comp_hard               Компьютерное Железо
comp_soft               Программы
comp_db                 Базы Данных
comp_osnet              ОС и Сети
computers               Компьютеры: Прочее
ref_encyc               Энциклопедии
ref_dict                Словари
ref_ref                 Справочники
ref_guide               Руководства
reference               Справочная Литература: Прочее
nonf_biography          Биографии и Мемуары
nonf_publicism          Публицистика
nonf_criticism          Критика
nonfiction              Документальное: Прочее
design                  Искусство, Дизайн
adv_animal              Природа и Животные
religion                Религия
religion_rel            Религия
religion_esoterics      Эзотерика
religion_self           Самосовершенствование
religion                Религия и духовность: Прочее
sci_religion            Религиоведение
humor_anecdote          Анекдоты
humor_prose             Юмористическая Проза
humor_verse             Юмористические Стихи
humor                   Юмор: Прочее
home_cooking            Кулинария
home_pets               Домашние Животные
home_crafts             Хобби, Ремесла
home_entertain          Развлечения
home_health             Здоровье
home_garden             Сад и Огород
home_diy                Сделай Сам
home_sport              Спорт
home_sex                Эротика, Секс
home                    Дом и Семья: Прочее
 */
