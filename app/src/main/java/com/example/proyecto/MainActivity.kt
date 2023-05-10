package com.example.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var restart_btn: Button
    lateinit var scissors_btn: Button
    lateinit var paper_btn: Button
    lateinit var rock_btn: Button
    lateinit var user_move_img: ImageView
    lateinit var computer_move_img: ImageView
    lateinit var winner_tv: TextView
    lateinit var computer_score: TextView
    lateinit var player_score: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        restart_btn = findViewById(R.id.restart_btn)
        scissors_btn = findViewById(R.id.scissors_btn)
        paper_btn = findViewById(R.id.paper_btn)
        rock_btn = findViewById(R.id.rock_btn)
        user_move_img = findViewById(R.id.user_move_img)
        computer_move_img = findViewById(R.id.computer_move_img)
        winner_tv = findViewById(R.id.winner_tv)
        computer_score = findViewById(R.id.computer_score)
        player_score = findViewById(R.id.player_score)

        restart_btn.setOnClickListener {
            clear_score()
        }

        scissors_btn.setOnClickListener {

            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors));

            val computer_move = (1..4).random()

            if (computer_move == 1) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.rock));

                winner_tv.text = "Computadora Gana"

                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()
            } else if (computer_move == 2) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper));

                winner_tv.text = "Jugador Gana"

                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            } else {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors));

                winner_tv.text = "Empate"
            }

        }

        paper_btn.setOnClickListener {

            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper));


            val computer_move = (1..4).random()

            if (computer_move == 1) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.rock));

                winner_tv.text = "Jugador Gana"

                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            }
            else if (computer_move == 2) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper));

                winner_tv.text = "Empate"
            } else {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors));

                winner_tv.text = "Computadora Gana"

                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()
            }

        }

        rock_btn.setOnClickListener {

            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.rock));


            val computer_move = (1..4).random()



            if (computer_move == 1) {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.rock));

                winner_tv.text = "Empate"

            } else if (computer_move == 2) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper));

                winner_tv.text = "Computadora Gana"

                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()


            } else {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors));

                winner_tv.text = "Jugaror Gana"

                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            }
        }
    }

    private fun clear_score() {

        computer_score.text = "0"
        player_score.text = "0"

        winner_tv.text = " "

        user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.question_mark));
        computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.question_mark));

    }

}
