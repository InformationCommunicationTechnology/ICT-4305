/**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeeSeven
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict_4305_grouptutorialassignmentweekseven;

/**
 *
 * @Date: 10/26/22
 * @author lutherchikumba
 *
 */
abstract class PlayerB extends NFLPlayer{

    public String name;
    public int stats;
    public String sport;

    public PlayerB(String name, int stats, String sport) {
        super(name, stats, sport);
    }

    public String getNameA()

    {

        return name;

    }

    abstract int getStatsA();
    abstract String getSportA();
}
