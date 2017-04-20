
//insert a checkbox and set onclick listener

c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Calendar cal=Calendar.getInstance();
                 cal.set(Calendar.HOUR_OF_DAY,18);
                cal.set(Calendar.MINUTE,30);
                cal.set(Calendar.SECOND,0);
                Intent i=new Intent(MainActivity.this,AlarmReceiver.class);
/*intent to alarmreceiver where notification is set*/
                
PendingIntent p=PendingIntent.getBroadcast(getBaseContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
                AlarmManager am=(AlarmManager)MainActivity.this.getSystemService(MainActivity.this.ALARM_SERVICE);
                am.setRepeating(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(),AlarmManager.INTERVAL_DAY,p);
            }