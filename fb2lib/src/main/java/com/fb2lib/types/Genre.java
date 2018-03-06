package com.fb2lib.types;

import com.fb2lib.R;

/**
 * Created by victor on 05.03.18.
 */

public enum Genre {sf_history("sf_history", R.string.sf_history), sf_action("sf_action",R.string.sf_action),
    sf_epic("sf_epic", R.string.sf_epic), sf_heroic("sf_heroic", R.string.sf_heroic),
    sf_detective("sf_detective", R.string.sf_detective), sf_cyberpunk("sf_cyberpunk",R.string.sf_cyberpunk),
    sf_space("sf_space",R.string.sf_space), sf_social("sf_social", R.string.sf_social),
    sf_horror("sf_horror",R.string.sf_horror), sf_humor("sf_humor",R.string.sf_humor),
    sf_fantasy("sf_fantasy",R.string.sf_fantasy), sf("sf", R.string.sf),
    det_classic("det_classic",R.string.det_classic), det_police("det_police", R.string.det_police),
    det_action("det_action",R.string.det_action), det_irony("det_irony", R.string.det_irony),
    det_history("det_history",R.string.det_history), det_espionage("det_espionage", R.string.det_espionage),
    det_crime("det_crime", R.string.det_crime), det_political("det_political",R.string.det_political),
    det_maniac("det_maniac",R.string.det_maniac), det_hard("det_hard", R.string.det_hard),
    thriller("thriller", R.string.thriller), detective("detective", R.string.detective),
    child_det("child_det", R.string.child_det), child_sf("child_sf", R.string.child_sf),
    child_prose("child_prose",R.string.child_prose), child_adv("child_adv", R.string.child_adv),
    children("children", R.string.children), child_tale("child_tale", R.string.child_tale),
    child_verse("child_verse", R.string.child_verse), child_education("child_education", R.string.child_education),
    prose("prose",R.string.prose), prose_classic("prose_classic", R.string.prose_classic),
    prose_history("prose_history",R.string.prose_history), prose_contemporary("prose_contemporary", R.string.prose_contemporary),
    prose_counter("prose_counter", R.string.prose_counter), prose_rus_classic("prose_rus_classic", R.string.prose_rus_classic),
    prose_su_classics("prose_su_classics", R.string.prose_su_classics), love_detective("love_detective", R.string.love_detective),
    love("love",R.string.love), love_contemporary("love_contemporary", R.string.love_contemporary),
    love_history("love_history", R.string.love_history), love_short("love_short", R.string.love_short),
    love_erotica("love_erotica", R.string.love_erotica), adv_western("adv_western", R.string.adv_western),
    adv_history("adv_history", R.string.adv_history), adv_indian("adv_indian", R.string.adv_indian),
    adv_maritime("adv_maritime", R.string.adv_maritime), adv_geo("adv_geo", R.string.adv_geo),
    adv_animal("adv_animal", R.string.adv_animal), adventure("adventure", R.string.adventure),
    poetry("poetry", R.string.poetry), dramaturgy("dramaturgy", R.string.dramaturgy),
    antique_ant("antique_ant", R.string.antique_ant), antique_european("antique_european", R.string.antique_european),
    antique_russian("antique_russian", R.string.antique_russian), antique_east("antique_east", R.string.antique_east),
    antique_myths("antique_myths", R.string.antique_myths), antique("antique", R.string.antique),
    sci_history("sci_history", R.string.sci_history), sci_psychology("sci_psychology", R.string.sci_psychology),
    sci_culture("sci_culture", R.string.sci_culture), sci_philosophy("sci_philosophy", R.string.sci_philosophy),
    sci_politics("sci_politics",R.string.sci_politics), sci_business("sci_business", R.string.sci_business),
    sci_juris("sci_juris", R.string.sci_juris), sci_linguistic("sci_linguistic", R.string.sci_linguistic),
    sci_medicine("sci_medicine", R.string.sci_medicine), sci_phys("sci_phys", R.string.sci_phys),
    sci_math("sci_math", R.string.sci_math), sci_chem("sci_chem", R.string.sci_chem),
    sci_biology("sci_biology", R.string.sci_biology), sci_tech("sci_tech", R.string.sci_tech),
    sci_religion("sci_religion", R.string.sci_religion), science("science", R.string.science),
    comp_www("comp_www", R.string.comp_www), comp_programming("comp_programming", R.string.comp_programming),
    comp_hard("comp_hard", R.string.comp_hard), comp_soft("comp_soft", R.string.comp_soft),
    comp_db("comp_db", R.string.comp_db), comp_osnet("comp_osnet", R.string.comp_osnet),
    computers("computers", R.string.computers), ref_encyc("ref_encyc", R.string.ref_encyc),
    ref_dict("ref_dict", R.string.ref_dict), ref_ref("ref_ref", R.string.ref_ref),
    ref_guide("ref_guide", R.string.ref_guide), reference("reference", R.string.reference),
    nonf_biography("nonf_biography", R.string.nonf_biography), nonf_publicism("nonf_publicism", R.string.nonf_publicism),
    nonf_criticism("nonf_criticism", R.string.nonf_criticism), nonfiction("nonfiction", R.string.nonfiction),
    design("design", R.string.design), religion_rel("religion_rel", R.string.religion_rel),
    religion_esoterics("religion_esoterics", R.string.religion_esoterics), religion_self("religion_self", R.string.religion_self),
    religion("religion", R.string.religion), humor_anecdote("humor_anecdote", R.string.humor_anecdote),
    humor_verse("humor_verse", R.string.humor_verse), humor_prose("humor_prose", R.string.humor_prose),
    humor("humor", R.string.humor), home_cooking("home_cooking", R.string.home_cooking),
    home_pets("home_pets", R.string.home_pets), home_crafts("home_crafts", R.string.home_crafts),
    home_entertain("home_entertain", R.string.home_entertain), home_health("home_health", R.string.home_health),
    home_garden("home_garden", R.string.home_garden), home_diy("home_diy", R.string.home_diy),
    home_sport("home_sport", R.string.home_sport), home_sex("home_sex", R.string.home_sex),
    home("home", R.string.home);
    private String fb2Notation;
    private int humanNotation;

    private Genre(String fb2Notation, int humanNotation){
        this.fb2Notation = fb2Notation;
        this.humanNotation = humanNotation;
    }
    public String getValue(){
        return this.fb2Notation;
    }
    public int getComment(){
        return this.humanNotation;
    }
}
