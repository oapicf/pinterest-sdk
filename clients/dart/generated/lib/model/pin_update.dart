//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinUpdate {
  /// Returns a new [PinUpdate] instance.
  PinUpdate({
    this.altText,
    this.boardId,
    this.boardSectionId,
    this.carouselSlots = const [],
    this.description,
    this.link,
    this.title,
  });

  String? altText;

  /// The board to which this Pin belongs.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? boardId;

  /// The board section to which this Pin belongs.
  String? boardSectionId;

  /// Carousel Pin slots data.
  List<CarouselSlot> carouselSlots;

  String? description;

  String? link;

  String? title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinUpdate &&
    other.altText == altText &&
    other.boardId == boardId &&
    other.boardSectionId == boardSectionId &&
    _deepEquality.equals(other.carouselSlots, carouselSlots) &&
    other.description == description &&
    other.link == link &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (altText == null ? 0 : altText!.hashCode) +
    (boardId == null ? 0 : boardId!.hashCode) +
    (boardSectionId == null ? 0 : boardSectionId!.hashCode) +
    (carouselSlots.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (title == null ? 0 : title!.hashCode);

  @override
  String toString() => 'PinUpdate[altText=$altText, boardId=$boardId, boardSectionId=$boardSectionId, carouselSlots=$carouselSlots, description=$description, link=$link, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.altText != null) {
      json[r'alt_text'] = this.altText;
    } else {
      json[r'alt_text'] = null;
    }
    if (this.boardId != null) {
      json[r'board_id'] = this.boardId;
    } else {
      json[r'board_id'] = null;
    }
    if (this.boardSectionId != null) {
      json[r'board_section_id'] = this.boardSectionId;
    } else {
      json[r'board_section_id'] = null;
    }
      json[r'carousel_slots'] = this.carouselSlots;
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    return json;
  }

  /// Returns a new [PinUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinUpdate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinUpdate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinUpdate(
        altText: mapValueOfType<String>(json, r'alt_text'),
        boardId: mapValueOfType<String>(json, r'board_id'),
        boardSectionId: mapValueOfType<String>(json, r'board_section_id'),
        carouselSlots: CarouselSlot.listFromJson(json[r'carousel_slots']),
        description: mapValueOfType<String>(json, r'description'),
        link: mapValueOfType<String>(json, r'link'),
        title: mapValueOfType<String>(json, r'title'),
      );
    }
    return null;
  }

  static List<PinUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinUpdate> mapFromJson(dynamic json) {
    final map = <String, PinUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinUpdate-objects as value to a dart map
  static Map<String, List<PinUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

