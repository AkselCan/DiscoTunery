# DIscoTunery :notes:

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
An app that lets users create random playlists that fit in with their needs.

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Music/Social
- **Mobile:** App is swipe-based, uses Spotify's credentials.
- **Story:** Allow users to create small personal music playlists and add them to their Spotify accounts.
- **Market:** Anyone that is interested in expanding their music libraries. Trying new music genres and finding hidden music gems in their current genres.
- **Habit:** Users can be notified of 1 possible new song to be added to a new playlist everyday/week/month (based on their preferences). Swiping mechanism encourages users to create more playlists with just a simple action.
- **Scope:** The app can start out as a personal music playlist generator, but can be expanded to a social app where people create playlists and share to their friends.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

- [ ] User can login into the app and make an account
[reference link]
- [ ] User can answer diagnostic questions and receive the best possible new song suggestions
- [ ] User can swipe on the 10 card suggestions, deciding whether they want the suggested song in their new possible "DiscoTunery" playlist
- [ ] User can adjust their preferences (using a drop-down preference finder)



**Optional Nice-to-have Stories**

- [ ] User can login, share, and see other friends' playlists created by using the app

### 2. Screen Archetypes

* [list first screen here]
   * [list associated required story here]
   * ...
* [list second screen here]
   * [list associated required story here]
   * ...

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* [fill out your first tab]
* [fill out your second tab]
* [fill out your third tab]

**Flow Navigation** (Screen to Screen)

* [list first screen here]
   * [list screen navigation here]
   * ...
* [list second screen here]
   * [list screen navigation here]
   * ...

## Wireframes
<img src="https://github.com/AkselCan/DiscoTunery/blob/main/WireFrames.jpg?raw=true" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 

### Models
#### Playlists
| Property      | Type     | Description |
| ------------- | -------- | ------------|
| songNum     | Number | number of songs in a playlist |
| createdAt     | DateTime | date when a playlist is created (default field) |
| updatedAt     | DateTime | date when a playlist is last updated (default field) |
| deletedAt     | DateTime | date when a playlist is deleted (default field) |
   
#### Users

 | Property      | Type     | Description |
 | ------------- | -------- | ------------|
 | userId       | String   | unique id for a user |
 | first_name       | String   | first name of a user |
 | last_name       | String   | last name of a user |
 
 
 #### Songs

 | Property      | Type     | Description |
 | ------------- | -------- | ------------|
 | songId       | String   | unique id for a song |
 | title       | String   | title of a song |
 | artist_id       | String   | id(s) of artist(s) performing the song |
 | year       | Number   | year a song came out |
 | duration       | Number   | duration of a song |
 | genre       | String   | genre of a song |
 | picture         | File     | a song might have an image view |
 | likesCount    | Number   | number of likes for a song |
 
  #### Artists

 | Property      | Type     | Description |
 | ------------- | -------- | ------------|
 | artistId       | String   | unique id for an artist |
 | name       | String   | name of an artist |
 | country       | String   | location of where an artist is based |
 | genre       | String   | an artist's genre(s) |
 | image         | File     | picture of an artist |
 | followsCount    | Number   | number of follows for an artist |

### Networking
### Add list of network requests by screen 
#### Home Screen
- [ ] (GET/Read) Playlists where user is the owner and sisplay them by date (teh newest at teh top of the screen).
- [ ] (Delete) Delete a Playlist from the My Playlists list.

#### Create Screen
- [ ] (Get/Read) Random lists of name and artists of music by using the Spotify API calls.
- [ ] (Create) Create a like/dislike for each song displayed
- [ ] (GET/Read) read and play part of the song by using the Instagram API calls.
- [ ] (Create) Create a playlist from the liked songs and join it with the Playlist Radio API call from Spotify.
- [ ] (Update/PUT) Update the automated name for the Playlist (Playlist number) and give the user the option to rename.
- [ ] (Update/PUT) Update the home screen and add the playlist to the top of the screen.

#### Setting Screen
- [ ] (GET/Read) the username and the profile image.
- [ ] (Update/PUT) the profile image and the username by asking them to logging in first beforehand.


- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]

## **Open-Source Libraries Used**

-[Spotify SDK](https://developer.spotify.com/documentation/android/) - Spotify APIs and Android SDK (in Beta).


