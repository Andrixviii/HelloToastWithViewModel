package lat.pam.hellotoast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    private val _currentName = MutableLiveData<Int>()
    val currentName: LiveData<Int> = _currentName

    // Fungsi untuk memperbarui nilai
    fun updateCount(newCount: Int) {
        _currentName.value = newCount
    }
}

