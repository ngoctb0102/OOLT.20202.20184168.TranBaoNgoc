package Lab07;

import java.util.*;
public class CompactDics extends Dics implements Playable{

    public CompactDics(String title, String category, float cost, int id, int length, String director) {
        super(title, category, cost, id, length, director);
    }
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public CompactDics(String title, String category, float cost, int id, int length, String director, String artist) {
        super(title, category, cost, id, length, director);
        this.artist = artist;
    }
    public void addTrack(Track track){
        if(! tracks.contains(track)){
            tracks.add(track);
            System.out.println("Track has been added");
        }else{
            System.out.println("Track already have");
        }
    }
    public void removeTrack(Track track){
        if(tracks.contains(track)){
            tracks.remove(track);
            System.out.println("Track has been remove");
        }else{
            System.out.println("Track not in list");
        }
    }
    public int getLength(){
        int l = 0;
        if(tracks.size() > 0){
            for(int i = 0; i< tracks.size();i++){
                l += tracks.get(i).getLength();
            }
        }else{
            System.out.println("Track is empty");
        }
        return l;
    }
    public void play(){
        if(tracks.size() > 0){
            for(int i = 0; i< tracks.size();i++){
                tracks.get(i).play();
            }
        }else{
            System.out.println("Track is empty");
        }
    }
}
