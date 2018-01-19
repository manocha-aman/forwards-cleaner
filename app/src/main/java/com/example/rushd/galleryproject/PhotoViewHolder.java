//package com.example.rushd.galleryproject;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class PhotoViewHolder extends RecyclerView.ViewHolder {
//    private ImageView imageView;
//    private TextView textView;
//    public PhotoViewHolder(View view) {
//        super(view);
//        imageView = (ImageView)view.findViewById(R.id.image_view);
//        textView = (TextView)view.findViewById(R.id.text_view);
//    }
//}
//private class PhotoAdapter extends RecyclerView.Adapter<PhotoViewHolder> {
//    @Override
//    public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new PhotoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo, parent, false));
//    }
//    @Override
//    public void onBindViewHolder(PhotoViewHolder holder, int position) {
//        Photo photo = photos.get(position);
//        // Attempt to load image from cache
//        Bitmap thumbnail = photoThumbnails.get(photo.getId());
//        if (thumbnail == null) {
//            // Image was not found in cache; load it from the server
//            ...
//        } else {
//            holder.imageView.setImageBitmap(thumbnail);
//        }
//        holder.textView.setText(photo.getTitle());
//    }
//    @Override
//    public int getItemCount() {
//        return (photos == null) ? 0 : photos.size();
//    }
//}