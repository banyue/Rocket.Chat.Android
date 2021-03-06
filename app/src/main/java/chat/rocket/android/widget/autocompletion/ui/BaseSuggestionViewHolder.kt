package chat.rocket.android.widget.autocompletion.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import chat.rocket.android.widget.autocompletion.model.SuggestionModel

abstract class BaseSuggestionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(item: SuggestionModel, itemClickListener: SuggestionsAdapter.ItemClickListener?)
}