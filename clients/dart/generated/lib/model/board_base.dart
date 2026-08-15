//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BoardBase {
  /// Returns a new [BoardBase] instance.
  BoardBase({
    this.boardPinsModifiedAt,
    this.collaboratorCount,
    this.createdAt,
    this.description,
    this.followerCount,
    required this.id,
    this.isAdsOnly = false,
    this.media,
    required this.name,
    this.owner,
    this.pinCount,
  });

  /// Date and time of last board pins modified.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? boardPinsModifiedAt;

  /// Count of collaborators on the board.
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? collaboratorCount;

  /// Date and time of board creation.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? createdAt;

  String? description;

  /// Board follower count.
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? followerCount;

  String id;

  /// If set to `true`, the board will be ad-only and can store ad-only Pins.
  bool isAdsOnly;

  /// Board media.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BoardMedia? media;

  ///      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  String name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BoardOwner? owner;

  /// Count of Pins on the board.
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pinCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BoardBase &&
    other.boardPinsModifiedAt == boardPinsModifiedAt &&
    other.collaboratorCount == collaboratorCount &&
    other.createdAt == createdAt &&
    other.description == description &&
    other.followerCount == followerCount &&
    other.id == id &&
    other.isAdsOnly == isAdsOnly &&
    other.media == media &&
    other.name == name &&
    other.owner == owner &&
    other.pinCount == pinCount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (boardPinsModifiedAt == null ? 0 : boardPinsModifiedAt!.hashCode) +
    (collaboratorCount == null ? 0 : collaboratorCount!.hashCode) +
    (createdAt == null ? 0 : createdAt!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (followerCount == null ? 0 : followerCount!.hashCode) +
    (id.hashCode) +
    (isAdsOnly.hashCode) +
    (media == null ? 0 : media!.hashCode) +
    (name.hashCode) +
    (owner == null ? 0 : owner!.hashCode) +
    (pinCount == null ? 0 : pinCount!.hashCode);

  @override
  String toString() => 'BoardBase[boardPinsModifiedAt=$boardPinsModifiedAt, collaboratorCount=$collaboratorCount, createdAt=$createdAt, description=$description, followerCount=$followerCount, id=$id, isAdsOnly=$isAdsOnly, media=$media, name=$name, owner=$owner, pinCount=$pinCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.boardPinsModifiedAt != null) {
      json[r'board_pins_modified_at'] = this.boardPinsModifiedAt!.toUtc().toIso8601String();
    } else {
      json[r'board_pins_modified_at'] = null;
    }
    if (this.collaboratorCount != null) {
      json[r'collaborator_count'] = this.collaboratorCount;
    } else {
      json[r'collaborator_count'] = null;
    }
    if (this.createdAt != null) {
      json[r'created_at'] = this.createdAt!.toUtc().toIso8601String();
    } else {
      json[r'created_at'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.followerCount != null) {
      json[r'follower_count'] = this.followerCount;
    } else {
      json[r'follower_count'] = null;
    }
      json[r'id'] = this.id;
      json[r'is_ads_only'] = this.isAdsOnly;
    if (this.media != null) {
      json[r'media'] = this.media;
    } else {
      json[r'media'] = null;
    }
      json[r'name'] = this.name;
    if (this.owner != null) {
      json[r'owner'] = this.owner;
    } else {
      json[r'owner'] = null;
    }
    if (this.pinCount != null) {
      json[r'pin_count'] = this.pinCount;
    } else {
      json[r'pin_count'] = null;
    }
    return json;
  }

  /// Returns a new [BoardBase] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BoardBase? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BoardBase[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BoardBase[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BoardBase(
        boardPinsModifiedAt: mapDateTime(json, r'board_pins_modified_at', r''),
        collaboratorCount: mapValueOfType<int>(json, r'collaborator_count'),
        createdAt: mapDateTime(json, r'created_at', r''),
        description: mapValueOfType<String>(json, r'description'),
        followerCount: mapValueOfType<int>(json, r'follower_count'),
        id: mapValueOfType<String>(json, r'id')!,
        isAdsOnly: mapValueOfType<bool>(json, r'is_ads_only') ?? false,
        media: BoardMedia.fromJson(json[r'media']),
        name: mapValueOfType<String>(json, r'name')!,
        owner: BoardOwner.fromJson(json[r'owner']),
        pinCount: mapValueOfType<int>(json, r'pin_count'),
      );
    }
    return null;
  }

  static List<BoardBase> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BoardBase>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BoardBase.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BoardBase> mapFromJson(dynamic json) {
    final map = <String, BoardBase>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BoardBase.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BoardBase-objects as value to a dart map
  static Map<String, List<BoardBase>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BoardBase>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BoardBase.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
  };
}

