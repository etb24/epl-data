package com.epl.epl_data.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_statistics")
public class Player {

    @Id
    @Column(name = "player", unique = true)
    private String name;
    private String nation;
    private String pos;
    private Integer age;
    private Integer mp;
    private Integer starts;
    private Double min;
    private Double gls;
    private Double ast;
    private Double pk;
    private Double crdy;
    private Double crdr;
    private Double xg;
    private Double xag;
    private String team;

    public Player() {
    }

    public Player(String name, String nation, String pos, Integer age, Integer mp, Integer starts, double min, double gls, double ast, double pk, double crdy, double crdr, double xg, double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getPos() {
        return pos;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMp() {
        return mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public double getMin() {
        return min;
    }

    public double getGls() {
        return gls;
    }

    public double getAst() {
        return ast;
    }

    public double getPk() {
        return pk;
    }

    public double getCrdy() {
        return crdy;
    }

    public double getCrdr() {
        return crdr;
    }

    public double getXg() {
        return xg;
    }

    public double getXag() {
        return xag;
    }

    public String getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setGls(double gls) {
        this.gls = gls;
    }

    public void setAst(double ast) {
        this.ast = ast;
    }

    public void setPk(double pk) {
        this.pk = pk;
    }

    public void setCrdy(double crdy) {
        this.crdy = crdy;
    }

    public void setCrdr(double crdr) {
        this.crdr = crdr;
    }

    public void setXg(double xg) {
        this.xg = xg;
    }

    public void setXag(double xag) {
        this.xag = xag;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
