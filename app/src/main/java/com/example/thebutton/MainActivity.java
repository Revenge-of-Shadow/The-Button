package com.example.thebutton;

import static com.example.thebutton.R.id.flexin;
import static com.example.thebutton.R.id.flexinView;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Movie;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.VolumeShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.io.InputStream;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    MediaPlayer mediaPlayer = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimationDrawable flexinAnimation = (AnimationDrawable) getResources().getDrawable(R.drawable.flexin, getTheme());
        ImageView flexingView = findViewById( R.id.flexinView);
        flexingView.setBackground( flexinAnimation);
        flexinAnimation.start();

    }


    public void onClickedStop(View view){
        mediaPlayer.stop();
    }

    public void onClickedTudududu(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tudududu);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }
    public void onClickedVera(View view){
        int vera = 0;
        switch (r.nextInt( 4)+1){
            case 1:
                vera = R.raw.vera;
                break;
            case 2:
                vera = R.raw.vera2;
                break;
            case 3:
                vera = R.raw.vera3;
                break;
            case 4:
                vera = R.raw.verra;
                break;
            case 5:
                vera = R.raw.veraaa;
                break;
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), vera);
        mediaPlayer.start();
    }

    public void onClickedVerochka(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.verochka);
        mediaPlayer.start();
    }

    public void onClickedVerunchik(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.verunchik);
        mediaPlayer.start();
    }

    public void onClickedVerraaaaa(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.verrraaaaaa);
        mediaPlayer.start();
    }
    public void onClickedILostOnPurpose(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.i_lost_on_purpose);
        mediaPlayer.start();
    }
    public void onClickedAh(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ah);
        mediaPlayer.start();
    }
    public void onClickedMalo(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cho_tak_malo);
        mediaPlayer.start();
    }
    public void onClickedFuckYourCopper(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fuck_your_copper);
        mediaPlayer.start();
    }
    public void onClickedIgorWhatHaveYouForgotten(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.igor_what_have_you_forgotten);
        mediaPlayer.start();
    }
    public void onClickedKorotko(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.korotko);
        mediaPlayer.start();
    }
    public void onClickedNoCommentary(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.no_commentary);
        mediaPlayer.start();
    }
    public void onClickedPidBahmut(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pid_bahmut);
        mediaPlayer.start();
    }
    public void onClickedSmokingIgor(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.smoking_igor);
        mediaPlayer.start();
    }
    public void onClickedStopIt(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.stop_it);
        mediaPlayer.start();
    }
    public void onClickedWillBeSoon(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.will_be_soon);
        mediaPlayer.start();
    }
    public void onClickedEiffel(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.eiffel);
        mediaPlayer.start();
    }
    public void onClickedRespect(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.respect);
        mediaPlayer.start();
    }
    public void onClickedParody(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.parody);
        mediaPlayer.start();
    }
    public void onClickedDodomu(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dodomu);
        mediaPlayer.start();
    }
    public void onClickedDrunk(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.drunk);
        mediaPlayer.start();
    }
    public void onClickedNaDerevi(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.na_derevi);
        mediaPlayer.start();
    }
    public void onClickedZYakimchukom(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.z_yakimchukom);
        mediaPlayer.start();
    }
    public void onClickedLove(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.love);
        mediaPlayer.start();
    }
    public void onClickedLove2(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.love2);
        mediaPlayer.start();
    }

    public void onClickedAfterDeath(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.after_death);
        mediaPlayer.start();
    }

    public void onClickedChicken(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chicken);
        mediaPlayer.start();
    }

    public void onClickedDa(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.da);
        mediaPlayer.start();
    }

    public void onClickedDobrePogulaty(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dobre_pogulaty);
        mediaPlayer.start();
    }

    public void onClickedGoodVariant(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.good_variant);
        mediaPlayer.start();
    }

    public void onClickedHappyMusic(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.happy_music);
        mediaPlayer.start();
    }

    public void onClickedHujnia(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hujnia);
        mediaPlayer.start();
    }

    public void onClickedLastManStanding(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.last_man_standing);
        mediaPlayer.start();
    }

    public void onClickedNonono(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nonono);
        mediaPlayer.start();
    }

    public void onClickedNoSleep(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.no_sleep);
        mediaPlayer.start();
    }

    public void onClickedNuDa(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nu_da);
        mediaPlayer.start();
    }

    public void onClickedOkay(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.okay);
        mediaPlayer.start();
    }

    public void onClickedOkay2(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.okay2);
        mediaPlayer.start();
    }

    public void onClickedOkay3(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.okay3);
        mediaPlayer.start();
    }

    public void onClickedPoluchaetsa(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.poluchaetsa);
        mediaPlayer.start();
    }

    public void onClickedRealno(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.realno);
        mediaPlayer.start();
    }

    public void onClickedTakeMe(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.take_me);
        mediaPlayer.start();
    }

    public void onClickedTrymayemTrend(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.trymayem_trend);
        mediaPlayer.start();
    }

    public void onClickedWhatDidIMiss(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.what_did_i_miss);
        mediaPlayer.start();
    }

    public void onClickedYakimchukMolodec(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yakimchuk_molodec);
        mediaPlayer.start();
    }

    public void onClickedEnough(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.enough);
        mediaPlayer.start();
    }

    public void onClickedGoodLuck(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.good_luck);
        mediaPlayer.start();
    }

    public void onClickedHandbook(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.handbook);
        mediaPlayer.start();
    }

    public void onClickedHehehehe(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hehehehe);
        mediaPlayer.start();
    }

    public void onClickedMaybe(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.maybe);
        mediaPlayer.start();
    }

    public void onClickedZironka(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.zironka);
        mediaPlayer.start();
    }

    public void onClickedTeasing(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teasing_the_armed);
        mediaPlayer.start();
    }

    public void onClickedBliat(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bliat);
        mediaPlayer.start();
    }

    public void onClickedBozhestvennyj(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bozhestwennyj);
        mediaPlayer.start();
    }

    public void onClickedGeroin(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.geroin);
        mediaPlayer.start();
    }

    public void onClickedKokain(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.kokain);
        mediaPlayer.start();
    }

    public void onClickedSportyly(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sportyly);
        mediaPlayer.start();
    }

    public void onClickedVelikolepen(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.velikolepen);
        mediaPlayer.start();
    }

    public void onClickedPlany(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.plany);
        mediaPlayer.start();
    }

    public void onClickedMda(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mda);
        mediaPlayer.start();
    }

    public void onClickedPraga(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.praga);
        mediaPlayer.start();
    }

    public void onClickedKrym(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.krym);
        mediaPlayer.start();
    }

    public void onClickedDozornyj(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dozornyj);
        mediaPlayer.start();
    }

    public void onClickedSlazey(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.slazey);
        mediaPlayer.start();
    }

    public void onClickedNaMenia(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.na_menia);
        mediaPlayer.start();
    }

    public void onClickedOdessa(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.odessa);
        mediaPlayer.start();
    }

    public void onClickedBubochka(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bubochka);
        mediaPlayer.start();
    }

    public void onClickedVsimSmertnym(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.vsim_smertnym);
        mediaPlayer.start();
    }

    public void onClickedHata(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hata);
        mediaPlayer.start();
    }

    public void onClickedItIsIgor(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.it_is_igor);
        mediaPlayer.start();
    }

    public void onClickedLies(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lies);
        mediaPlayer.start();
    }

    public void onClickedLiesPelmeni(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lies_pelmeni);
        mediaPlayer.start();
    }

    public void onClickedMaksimka(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.maksimka);
        mediaPlayer.start();
    }

    public void onClickedPelmeshki(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pelmeshki);
        mediaPlayer.start();
    }

    public void onClickedSocks(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.socks);
        mediaPlayer.start();
    }

    public void onClickedSoniaNakazana(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sonia_nakazana);
        mediaPlayer.start();
    }

    public void onClickedSonkozavr(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sonkozavr);
        mediaPlayer.start();
    }

    public void onClickedAliona(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aliona);
        mediaPlayer.start();
    }

    public void onClickedFindYakimchuk(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.find_yakimchuk);
        mediaPlayer.start();
    }

    public void onClickedIgorMolchit(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.igor_molchit);
        mediaPlayer.start();
    }

    public void onClickedMuhuin(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.muhuin);
        mediaPlayer.start();
    }

    public void onClickedSms500(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sms500);
        mediaPlayer.start();
    }

    public void onClickedAh12(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ah_12);
        mediaPlayer.start();
    }

    public void onClickedChords(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chords);
        mediaPlayer.start();
    }

    public void onClickedNaMatematyci(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.na_matematyci);
        mediaPlayer.start();
    }

    public void onClickedPresentation(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.presentation);
        mediaPlayer.start();
    }

    public void onClickedChernyi(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chernyi);
        mediaPlayer.start();
    }

    public void onClickedFishFound(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fish_found);
        mediaPlayer.start();
    }

    public void onClickedGeography(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.geography);
        mediaPlayer.start();
    }

    public void onClickedKrasivo(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.krasivo);
        mediaPlayer.start();
    }

    public void onClickedLandon(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.landon);
        mediaPlayer.start();
    }

    public void onClickedLookingForFish(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.looking_for_fish);
        mediaPlayer.start();
    }

    public void onClickedMolodecYarik(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.molodec_yarik);
        mediaPlayer.start();
    }

    public void onClickedNmt(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nmt);
        mediaPlayer.start();
    }

    public void onClickedPipes(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pipes);
        mediaPlayer.start();
    }

    public void onClickedPipesAwait(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pipes_await);
        mediaPlayer.start();
    }

    public void onClickedTrap(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.trap);
        mediaPlayer.start();
    }


    public void onClicked(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), 0);
        mediaPlayer.start();
    }

}