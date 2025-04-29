# 📋 PromptPalette Roadmap  
**Last updated:** 2025-04-29  
**Repository:** https://github.com/kyrylkoivan/promptpalette-android  

## 📅 Sprint Cadence  
- **Sprint Length:** 1 week (Mon – Sun)  
- **Ceremony:**  
  - *Monday morning:* pick 2–3 top stories  
  - *Friday afternoon:* demo & retro in code comments  

---

## 🏃‍♂️ Sprint 1: Generator MVP  
**Dates:** 2025-05-04 – 2025-05-10  
**Goal:** Users can tap “Roll” and see a random prompt + confetti animation.  

### 🔨 Stories  
- [ ] **Roll algorithm** ([#5](https://github.com/kyrylkoivan/promptpalette-android/issues/5))  
  - Assemble one token per bucket, no duplicates  
  - Unit tests confirm uniqueness  
  - _Estimate: 4 h_  
- [ ] **Confetti animation** ([#6](https://github.com/kyrylkoivan/promptpalette-android/issues/6))  
  - Trigger Lottie confetti on button press  
  - Complete within 800 ms total  
  - _Estimate: 3 h_  
- [ ] **UI polish** ([#7](https://github.com/kyrylkoivan/promptpalette-android/issues/7))  
  - “Roll” button matches Material 3 spec  
  - Dark-mode styling validated  
  - _Estimate: 2 h_  

### ✅ Definition of Done  
1. All checkboxes complete  
2. `GeneratorScreen` shows text + confetti  
3. `./gradlew test` passes  
4. Device demo recorded & attached to Issue #5  

---

## 🗂 Backlog  
1. JSON import/export via SAF  
2. Bucket Editor + Room integration  
3. Google Play Billing setup (Pro-Key)  
4. Rewarded ads with AdMob  
5. Share-as-PNG card styling  
6. Crash reporting & analytics  
7. Localization prep (es, pt-BR, hi, ru)  
8. CI badge in README  

---

