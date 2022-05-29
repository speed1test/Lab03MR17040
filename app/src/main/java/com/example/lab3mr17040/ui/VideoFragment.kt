package com.example.lab3mr17040.ui
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import com.example.lab3mr17040.R

class VideoFragment : Fragment() {
    private lateinit var videoView: VideoView
    private lateinit var mediaController: MediaController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragment = inflater.inflate(R.layout.fragment_gallery, container, false)
        videoView = fragment.findViewById(R.id.videoView1)
        videoView.setVideoPath("https://eisi.fia.ues.edu.sv/materialpublico/pdm115/video2.3gp")
        mediaController = MediaController(context)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()
        return fragment
    }
}