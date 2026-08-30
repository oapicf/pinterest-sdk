//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinCreate {
  /// Returns a new [PinCreate] instance.
  PinCreate({
    this.aiDisclosures,
    this.altText,
    this.boardId,
    this.boardSectionId,
    this.description,
    this.dominantColor,
    this.link,
    this.mediaSource,
    this.parentPinId,
    this.sponsorId,
    this.title,
  });

  /// AI disclosure declarations the creator has made about this Pin.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AiDisclosures? aiDisclosures;

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

  String? description;

  /// Dominant pin color. Hex number, e.g. `#6E7874`.
  String? dominantColor;

  String? link;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PinMediaSource? mediaSource;

  /// The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  String? parentPinId;

  /// The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
  String? sponsorId;

  String? title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinCreate &&
    other.aiDisclosures == aiDisclosures &&
    other.altText == altText &&
    other.boardId == boardId &&
    other.boardSectionId == boardSectionId &&
    other.description == description &&
    other.dominantColor == dominantColor &&
    other.link == link &&
    other.mediaSource == mediaSource &&
    other.parentPinId == parentPinId &&
    other.sponsorId == sponsorId &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (aiDisclosures == null ? 0 : aiDisclosures!.hashCode) +
    (altText == null ? 0 : altText!.hashCode) +
    (boardId == null ? 0 : boardId!.hashCode) +
    (boardSectionId == null ? 0 : boardSectionId!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (dominantColor == null ? 0 : dominantColor!.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (mediaSource == null ? 0 : mediaSource!.hashCode) +
    (parentPinId == null ? 0 : parentPinId!.hashCode) +
    (sponsorId == null ? 0 : sponsorId!.hashCode) +
    (title == null ? 0 : title!.hashCode);

  @override
  String toString() => 'PinCreate[aiDisclosures=$aiDisclosures, altText=$altText, boardId=$boardId, boardSectionId=$boardSectionId, description=$description, dominantColor=$dominantColor, link=$link, mediaSource=$mediaSource, parentPinId=$parentPinId, sponsorId=$sponsorId, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.aiDisclosures != null) {
      json[r'ai_disclosures'] = this.aiDisclosures;
    } else {
      json[r'ai_disclosures'] = null;
    }
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
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.dominantColor != null) {
      json[r'dominant_color'] = this.dominantColor;
    } else {
      json[r'dominant_color'] = null;
    }
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    if (this.mediaSource != null) {
      json[r'media_source'] = this.mediaSource;
    } else {
      json[r'media_source'] = null;
    }
    if (this.parentPinId != null) {
      json[r'parent_pin_id'] = this.parentPinId;
    } else {
      json[r'parent_pin_id'] = null;
    }
    if (this.sponsorId != null) {
      json[r'sponsor_id'] = this.sponsorId;
    } else {
      json[r'sponsor_id'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    return json;
  }

  /// Returns a new [PinCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return PinCreate(
        aiDisclosures: AiDisclosures.fromJson(json[r'ai_disclosures']),
        altText: mapValueOfType<String>(json, r'alt_text'),
        boardId: mapValueOfType<String>(json, r'board_id'),
        boardSectionId: mapValueOfType<String>(json, r'board_section_id'),
        description: mapValueOfType<String>(json, r'description'),
        dominantColor: mapValueOfType<String>(json, r'dominant_color'),
        link: mapValueOfType<String>(json, r'link'),
        mediaSource: PinMediaSource.fromJson(json[r'media_source']),
        parentPinId: mapValueOfType<String>(json, r'parent_pin_id'),
        sponsorId: mapValueOfType<String>(json, r'sponsor_id'),
        title: mapValueOfType<String>(json, r'title'),
      );
    }
    return null;
  }

  static List<PinCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinCreate> mapFromJson(dynamic json) {
    final map = <String, PinCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinCreate-objects as value to a dart map
  static Map<String, List<PinCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

