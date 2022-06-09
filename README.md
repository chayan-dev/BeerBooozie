# BeerBooozie

An Android app that displays data from Punk API, an open-source API that displays detailed information on delicious craft-beer.

## Features
*   Implementation of android [MVVM Architecture Pattern](https://developer.android.com/jetpack/guide).
*   Data single source of truth implementation and google suggested practice for code separation using [Repository Architecture](https://codelabs.developers.google.com/codelabs/android-training-livedata-viewmodel/index.html#7).
*   Functional programming implementation by observing to data changes with [LiveData](https://codelabs.developers.google.com/codelabs/android-training-livedata-viewmodel/index.html#5).
*   Using [ViewModel](https://codelabs.developers.google.com/codelabs/android-training-livedata-viewmodel/index.html#8) to serve as the bridge between datasource and UI. ViewModel implementation also makes sure data is not lost during configurations changes as its lifecycle aware.
*   Managing of asynchronous calls using [Kotlin Coroutines](https://codelabs.developers.google.com/codelabs/kotlin-coroutines/#0).
*   Display list with [RecyclerView](https://codelabs.developers.google.com/codelabs/android-training-create-recycler-view/index.html#0).
