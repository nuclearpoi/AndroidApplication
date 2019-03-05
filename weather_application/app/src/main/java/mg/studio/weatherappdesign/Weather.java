package mg.studio.weatherappdesign;

import java.util.List;

//dispose .json
public class Weather {
    /**
     * cod : 200
     * message : 0.0054
     * cnt : 39
     * list : [{"dt":1551495600,"main":{"temp":8.69,"temp_min":7.58,"temp_max":8.69,"pressure":1017.23,"sea_level":1017.23,"grnd_level":926.89,"humidity":98,"temp_kf":1.11},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.41,"deg":167.501},"rain":{"3h":0.535},"sys":{"pod":"d"},"dt_txt":"2019-03-02 03:00:00"},{"dt":1551506400,"main":{"temp":9.5,"temp_min":8.67,"temp_max":9.5,"pressure":1015.13,"sea_level":1015.13,"grnd_level":925.42,"humidity":93,"temp_kf":0.84},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.41,"deg":215.501},"rain":{"3h":0.235},"sys":{"pod":"d"},"dt_txt":"2019-03-02 06:00:00"},{"dt":1551517200,"main":{"temp":10.09,"temp_min":9.53,"temp_max":10.09,"pressure":1014.14,"sea_level":1014.14,"grnd_level":924.72,"humidity":90,"temp_kf":0.56},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":1.32,"deg":274.501},"rain":{"3h":0.09},"sys":{"pod":"d"},"dt_txt":"2019-03-02 09:00:00"},{"dt":1551528000,"main":{"temp":7.53,"temp_min":7.25,"temp_max":7.53,"pressure":1016.18,"sea_level":1016.18,"grnd_level":925.99,"humidity":95,"temp_kf":0.28},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":64},"wind":{"speed":0.97,"deg":42.5015},"rain":{"3h":0.015},"sys":{"pod":"n"},"dt_txt":"2019-03-02 12:00:00"},{"dt":1551538800,"main":{"temp":4.12,"temp_min":4.12,"temp_max":4.12,"pressure":1018.79,"sea_level":1018.79,"grnd_level":927.85,"humidity":96,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"多云","icon":"04n"}],"clouds":{"all":80},"wind":{"speed":1.06,"deg":21.0005},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-02 15:00:00"},{"dt":1551549600,"main":{"temp":5.59,"temp_min":5.59,"temp_max":5.59,"pressure":1019.03,"sea_level":1019.03,"grnd_level":927.77,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.78,"deg":77.0002},"rain":{"3h":0.055},"sys":{"pod":"n"},"dt_txt":"2019-03-02 18:00:00"},{"dt":1551560400,"main":{"temp":6.08,"temp_min":6.08,"temp_max":6.08,"pressure":1017.95,"sea_level":1017.95,"grnd_level":926.55,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":1.07,"deg":185.5},"rain":{"3h":0.07},"sys":{"pod":"n"},"dt_txt":"2019-03-02 21:00:00"},{"dt":1551571200,"main":{"temp":5.25,"temp_min":5.25,"temp_max":5.25,"pressure":1018.99,"sea_level":1018.99,"grnd_level":927.36,"humidity":98,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"多云","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":1.21,"deg":155.002},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-03 00:00:00"},{"dt":1551582000,"main":{"temp":9.52,"temp_min":9.52,"temp_max":9.52,"pressure":1018.49,"sea_level":1018.49,"grnd_level":928.16,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":1.25,"deg":237.005},"rain":{"3h":0.14},"sys":{"pod":"d"},"dt_txt":"2019-03-03 03:00:00"},{"dt":1551592800,"main":{"temp":11.91,"temp_min":11.91,"temp_max":11.91,"pressure":1014.61,"sea_level":1014.61,"grnd_level":925.64,"humidity":84,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":36},"wind":{"speed":1.32,"deg":312},"rain":{"3h":0.02},"sys":{"pod":"d"},"dt_txt":"2019-03-03 06:00:00"},{"dt":1551603600,"main":{"temp":13.48,"temp_min":13.48,"temp_max":13.48,"pressure":1011.55,"sea_level":1011.55,"grnd_level":923.09,"humidity":71,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":0.57,"deg":145.503},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-03 09:00:00"},{"dt":1551614400,"main":{"temp":8.28,"temp_min":8.28,"temp_max":8.28,"pressure":1012.85,"sea_level":1012.85,"grnd_level":923.28,"humidity":87,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":0.96,"deg":9.00156},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 12:00:00"},{"dt":1551625200,"main":{"temp":4.36,"temp_min":4.36,"temp_max":4.36,"pressure":1014.11,"sea_level":1014.11,"grnd_level":923.85,"humidity":94,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":0.92,"deg":107.502},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 15:00:00"},{"dt":1551636000,"main":{"temp":2.55,"temp_min":2.55,"temp_max":2.55,"pressure":1013.48,"sea_level":1013.48,"grnd_level":922.75,"humidity":90,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"晴，少云","icon":"02n"}],"clouds":{"all":12},"wind":{"speed":0.97,"deg":145.504},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 18:00:00"},{"dt":1551646800,"main":{"temp":2.17,"temp_min":2.17,"temp_max":2.17,"pressure":1011.55,"sea_level":1011.55,"grnd_level":920.9,"humidity":93,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"多云","icon":"03n"}],"clouds":{"all":48},"wind":{"speed":1.01,"deg":112.002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 21:00:00"},{"dt":1551657600,"main":{"temp":3.84,"temp_min":3.84,"temp_max":3.84,"pressure":1011.64,"sea_level":1011.64,"grnd_level":921.03,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":64},"wind":{"speed":1.06,"deg":113.504},"rain":{"3h":0.03},"sys":{"pod":"d"},"dt_txt":"2019-03-04 00:00:00"},{"dt":1551668400,"main":{"temp":10.22,"temp_min":10.22,"temp_max":10.22,"pressure":1010.94,"sea_level":1010.94,"grnd_level":921.49,"humidity":82,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":64},"wind":{"speed":1.47,"deg":119.503},"rain":{"3h":0.0099999999999998},"sys":{"pod":"d"},"dt_txt":"2019-03-04 03:00:00"},{"dt":1551679200,"main":{"temp":13.93,"temp_min":13.93,"temp_max":13.93,"pressure":1007.38,"sea_level":1007.38,"grnd_level":919.07,"humidity":72,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"多云","icon":"04d"}],"clouds":{"all":56},"wind":{"speed":1.51,"deg":122.001},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-04 06:00:00"},{"dt":1551690000,"main":{"temp":15,"temp_min":15,"temp_max":15,"pressure":1005.67,"sea_level":1005.67,"grnd_level":917.68,"humidity":72,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"多云","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":1.88,"deg":129.001},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-04 09:00:00"},{"dt":1551700800,"main":{"temp":10.99,"temp_min":10.99,"temp_max":10.99,"pressure":1007.64,"sea_level":1007.64,"grnd_level":918.95,"humidity":79,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"多云","icon":"04n"}],"clouds":{"all":76},"wind":{"speed":1.5,"deg":113.002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-04 12:00:00"},{"dt":1551711600,"main":{"temp":9.13,"temp_min":9.13,"temp_max":9.13,"pressure":1010.21,"sea_level":1010.21,"grnd_level":920.88,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.02,"deg":102},"rain":{"3h":0.92},"sys":{"pod":"n"},"dt_txt":"2019-03-04 15:00:00"},{"dt":1551722400,"main":{"temp":8.29,"temp_min":8.29,"temp_max":8.29,"pressure":1011.11,"sea_level":1011.11,"grnd_level":921.52,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.07,"deg":136.002},"rain":{"3h":0.44},"sys":{"pod":"n"},"dt_txt":"2019-03-04 18:00:00"},{"dt":1551733200,"main":{"temp":8.17,"temp_min":8.17,"temp_max":8.17,"pressure":1011.44,"sea_level":1011.44,"grnd_level":921.73,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.11,"deg":153},"rain":{"3h":0.96},"sys":{"pod":"n"},"dt_txt":"2019-03-04 21:00:00"},{"dt":1551744000,"main":{"temp":8.35,"temp_min":8.35,"temp_max":8.35,"pressure":1013.32,"sea_level":1013.32,"grnd_level":923.45,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.22,"deg":141},"rain":{"3h":1.53},"sys":{"pod":"d"},"dt_txt":"2019-03-05 00:00:00"},{"dt":1551754800,"main":{"temp":10.06,"temp_min":10.06,"temp_max":10.06,"pressure":1014.65,"sea_level":1014.65,"grnd_level":925.27,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.06,"deg":186.503},"rain":{"3h":1.2},"sys":{"pod":"d"},"dt_txt":"2019-03-05 03:00:00"},{"dt":1551765600,"main":{"temp":10.42,"temp_min":10.42,"temp_max":10.42,"pressure":1014.05,"sea_level":1014.05,"grnd_level":925.09,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.42,"deg":314.501},"rain":{"3h":1.73},"sys":{"pod":"d"},"dt_txt":"2019-03-05 06:00:00"},{"dt":1551776400,"main":{"temp":10.06,"temp_min":10.06,"temp_max":10.06,"pressure":1014.02,"sea_level":1014.02,"grnd_level":925.16,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.48,"deg":339.503},"rain":{"3h":1.83},"sys":{"pod":"d"},"dt_txt":"2019-03-05 09:00:00"},{"dt":1551787200,"main":{"temp":9.42,"temp_min":9.42,"temp_max":9.42,"pressure":1016.13,"sea_level":1016.13,"grnd_level":926.64,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.08,"deg":353.002},"rain":{"3h":1.62},"sys":{"pod":"n"},"dt_txt":"2019-03-05 12:00:00"},{"dt":1551798000,"main":{"temp":9.05,"temp_min":9.05,"temp_max":9.05,"pressure":1018.12,"sea_level":1018.12,"grnd_level":928.12,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":1.06,"deg":329.001},"rain":{"3h":0.39},"sys":{"pod":"n"},"dt_txt":"2019-03-05 15:00:00"},{"dt":1551808800,"main":{"temp":8.66,"temp_min":8.66,"temp_max":8.66,"pressure":1017.95,"sea_level":1017.95,"grnd_level":927.7,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.51,"deg":218.003},"rain":{"3h":0.37},"sys":{"pod":"n"},"dt_txt":"2019-03-05 18:00:00"},{"dt":1551819600,"main":{"temp":8.44,"temp_min":8.44,"temp_max":8.44,"pressure":1017.89,"sea_level":1017.89,"grnd_level":927.43,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.82,"deg":115},"rain":{"3h":1.04},"sys":{"pod":"n"},"dt_txt":"2019-03-05 21:00:00"},{"dt":1551830400,"main":{"temp":8.51,"temp_min":8.51,"temp_max":8.51,"pressure":1019.42,"sea_level":1019.42,"grnd_level":928.7,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.26,"deg":117.501},"rain":{"3h":1.17},"sys":{"pod":"d"},"dt_txt":"2019-03-06 00:00:00"},{"dt":1551841200,"main":{"temp":10.11,"temp_min":10.11,"temp_max":10.11,"pressure":1019.94,"sea_level":1019.94,"grnd_level":930.03,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.22,"deg":91.5003},"rain":{"3h":0.57},"sys":{"pod":"d"},"dt_txt":"2019-03-06 03:00:00"},{"dt":1551852000,"main":{"temp":10.47,"temp_min":10.47,"temp_max":10.47,"pressure":1018.24,"sea_level":1018.24,"grnd_level":928.79,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.27,"deg":110},"rain":{"3h":0.44},"sys":{"pod":"d"},"dt_txt":"2019-03-06 06:00:00"},{"dt":1551862800,"main":{"temp":10.34,"temp_min":10.34,"temp_max":10.34,"pressure":1016.8,"sea_level":1016.8,"grnd_level":927.46,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":76},"wind":{"speed":1.07,"deg":108.502},"rain":{"3h":0.12},"sys":{"pod":"d"},"dt_txt":"2019-03-06 09:00:00"},{"dt":1551873600,"main":{"temp":8.65,"temp_min":8.65,"temp_max":8.65,"pressure":1018.19,"sea_level":1018.19,"grnd_level":928.28,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":1.31,"deg":119.5},"rain":{"3h":0.02},"sys":{"pod":"n"},"dt_txt":"2019-03-06 12:00:00"},{"dt":1551884400,"main":{"temp":7.38,"temp_min":7.38,"temp_max":7.38,"pressure":1018.69,"sea_level":1018.69,"grnd_level":928.38,"humidity":89,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":2.33,"deg":125.003},"rain":{"3h":0.009999999999998},"sys":{"pod":"n"},"dt_txt":"2019-03-06 15:00:00"},{"dt":1551895200,"main":{"temp":6.4,"temp_min":6.4,"temp_max":6.4,"pressure":1019.58,"sea_level":1019.58,"grnd_level":928.94,"humidity":92,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.27,"deg":142.5},"rain":{"3h":0.28},"sys":{"pod":"n"},"dt_txt":"2019-03-06 18:00:00"},{"dt":1551906000,"main":{"temp":5.09,"temp_min":5.09,"temp_max":5.09,"pressure":1019.02,"sea_level":1019.02,"grnd_level":927.94,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.32,"deg":123.002},"rain":{"3h":1.46},"sys":{"pod":"n"},"dt_txt":"2019-03-06 21:00:00"}]
     * city : {"id":1814905,"name":"Chongqing Shi","coord":{"lat":30.25,"lon":107.75},"country":"CN"}
     */

    private String cod="";
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {

        private int id;
        private String name;
        private CoordBean coord;
        private String country;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public static class CoordBean {

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1551495600
         * main : {"temp":8.69,"temp_min":7.58,"temp_max":8.69,"pressure":1017.23,"sea_level":1017.23,"grnd_level":926.89,"humidity":98,"temp_kf":1.11}
         * weather : [{"id":500,"main":"Rain","description":"小雨","icon":"10d"}]
         * clouds : {"all":92}
         * wind : {"speed":1.41,"deg":167.501}
         * rain : {"3h":0.535}
         * sys : {"pod":"d"}
         * dt_txt : 2019-03-02 03:00:00
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SysBean sys;
        private String dt_txt;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 92
             */
            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 1.41
             * deg : 167.501
             */
            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class RainBean {
            /**
             * 3h : 0.535
             */
            @com.google.gson.annotations.SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class SysBean {
            /**
             * pod : d
             */
            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class WeatherBean {
            /**
             * id : 500
             * main : Rain
             * description : 小雨
             * icon : 10d
             */
            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
