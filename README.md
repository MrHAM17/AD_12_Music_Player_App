## AD_12_Music_Player_App

### 📱 Short Description

Application demonstrating the use of an **Android Service** to play music (a default ringtone) continuously in the background, independent of the UI.

---

### 🧩 Concepts Covered

* **Android Service** (component running long-running operations in the background)
* **Media Player** class for handling audio playback
* **Unbound Service** (started via `startService()`)
* `onStartCommand()` (where service execution logic begins)
* Service registration in `AndroidManifest.xml`

---

### 🎯 Learning / Discovery Points

* Creating a custom class that **extends `Service`**.
* Initializing the `MediaPlayer` and setting the audio source (e.g., default ringtone).
* Starting the service using an **explicit Intent** passed to `startService()`.
* Stopping the service explicitly using `stopService()`.
* The music continues to play even if the user navigates away from the Activity.

---

### ⚙️ App Features / Usage

* Button to **Start Service** (begins playing audio continuously).
* Button to **Stop Service** (stops background playback).

---

### 📝 Note

Services are used for tasks that must run irrespective of the user interface lifecycle, ensuring background continuity (e.g., music playback, file downloads).

---

### Screenshots
<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Main Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_12_Music_Player_App/blob/main/Result%20Pics/01%20Main%20Screen.jpg" height="510" width="240"> </td> </tr> </table>

---
