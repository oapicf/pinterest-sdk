//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinBase {
  /// Returns a new [PinBase] instance.
  PinBase({
    this.aiDisclosures,
    this.boardId,
    this.boardOwner,
    this.boardSectionId,
    this.createdAt,
    this.creativeType,
    this.dominantColor,
    this.hasBeenPromoted,
    required this.id,
    this.isOwner,
    this.isProduct,
    this.isStandard,
    this.media,
    this.parentPinId,
    this.pinMetrics,
  });

  /// AI disclosure declarations the creator has made about this Pin.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AiDisclosures? aiDisclosures;

  /// The board to which this Pin belongs.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? boardId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BoardOwner? boardOwner;

  /// The board section to which this Pin belongs.
  String? boardSectionId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? createdAt;

  CreativeType? creativeType;

  /// Dominant pin color. Hex number, e.g. `#6E7874`.
  String? dominantColor;

  /// Whether the Pin has been promoted or not.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasBeenPromoted;

  String id;

  /// Whether the \"operation user_account\" is the Pin owner.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isOwner;

  /// Whether the Pin is a product Pin.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isProduct;

  /// Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isStandard;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PinMedia? media;

  /// The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  String? parentPinId;

  /// Pin metrics with associated time intervals if any.
  Object? pinMetrics;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinBase &&
    other.aiDisclosures == aiDisclosures &&
    other.boardId == boardId &&
    other.boardOwner == boardOwner &&
    other.boardSectionId == boardSectionId &&
    other.createdAt == createdAt &&
    other.creativeType == creativeType &&
    other.dominantColor == dominantColor &&
    other.hasBeenPromoted == hasBeenPromoted &&
    other.id == id &&
    other.isOwner == isOwner &&
    other.isProduct == isProduct &&
    other.isStandard == isStandard &&
    other.media == media &&
    other.parentPinId == parentPinId &&
    other.pinMetrics == pinMetrics;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (aiDisclosures == null ? 0 : aiDisclosures!.hashCode) +
    (boardId == null ? 0 : boardId!.hashCode) +
    (boardOwner == null ? 0 : boardOwner!.hashCode) +
    (boardSectionId == null ? 0 : boardSectionId!.hashCode) +
    (createdAt == null ? 0 : createdAt!.hashCode) +
    (creativeType == null ? 0 : creativeType!.hashCode) +
    (dominantColor == null ? 0 : dominantColor!.hashCode) +
    (hasBeenPromoted == null ? 0 : hasBeenPromoted!.hashCode) +
    (id.hashCode) +
    (isOwner == null ? 0 : isOwner!.hashCode) +
    (isProduct == null ? 0 : isProduct!.hashCode) +
    (isStandard == null ? 0 : isStandard!.hashCode) +
    (media == null ? 0 : media!.hashCode) +
    (parentPinId == null ? 0 : parentPinId!.hashCode) +
    (pinMetrics == null ? 0 : pinMetrics!.hashCode);

  @override
  String toString() => 'PinBase[aiDisclosures=$aiDisclosures, boardId=$boardId, boardOwner=$boardOwner, boardSectionId=$boardSectionId, createdAt=$createdAt, creativeType=$creativeType, dominantColor=$dominantColor, hasBeenPromoted=$hasBeenPromoted, id=$id, isOwner=$isOwner, isProduct=$isProduct, isStandard=$isStandard, media=$media, parentPinId=$parentPinId, pinMetrics=$pinMetrics]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.aiDisclosures != null) {
      json[r'ai_disclosures'] = this.aiDisclosures;
    } else {
      json[r'ai_disclosures'] = null;
    }
    if (this.boardId != null) {
      json[r'board_id'] = this.boardId;
    } else {
      json[r'board_id'] = null;
    }
    if (this.boardOwner != null) {
      json[r'board_owner'] = this.boardOwner;
    } else {
      json[r'board_owner'] = null;
    }
    if (this.boardSectionId != null) {
      json[r'board_section_id'] = this.boardSectionId;
    } else {
      json[r'board_section_id'] = null;
    }
    if (this.createdAt != null) {
      json[r'created_at'] = this.createdAt!.toUtc().toIso8601String();
    } else {
      json[r'created_at'] = null;
    }
    if (this.creativeType != null) {
      json[r'creative_type'] = this.creativeType;
    } else {
      json[r'creative_type'] = null;
    }
    if (this.dominantColor != null) {
      json[r'dominant_color'] = this.dominantColor;
    } else {
      json[r'dominant_color'] = null;
    }
    if (this.hasBeenPromoted != null) {
      json[r'has_been_promoted'] = this.hasBeenPromoted;
    } else {
      json[r'has_been_promoted'] = null;
    }
      json[r'id'] = this.id;
    if (this.isOwner != null) {
      json[r'is_owner'] = this.isOwner;
    } else {
      json[r'is_owner'] = null;
    }
    if (this.isProduct != null) {
      json[r'is_product'] = this.isProduct;
    } else {
      json[r'is_product'] = null;
    }
    if (this.isStandard != null) {
      json[r'is_standard'] = this.isStandard;
    } else {
      json[r'is_standard'] = null;
    }
    if (this.media != null) {
      json[r'media'] = this.media;
    } else {
      json[r'media'] = null;
    }
    if (this.parentPinId != null) {
      json[r'parent_pin_id'] = this.parentPinId;
    } else {
      json[r'parent_pin_id'] = null;
    }
    if (this.pinMetrics != null) {
      json[r'pin_metrics'] = this.pinMetrics;
    } else {
      json[r'pin_metrics'] = null;
    }
    return json;
  }

  /// Returns a new [PinBase] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinBase? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "PinBase[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "PinBase[id]" has a null value in JSON.');
        return true;
      }());

      return PinBase(
        aiDisclosures: AiDisclosures.fromJson(json[r'ai_disclosures']),
        boardId: mapValueOfType<String>(json, r'board_id'),
        boardOwner: BoardOwner.fromJson(json[r'board_owner']),
        boardSectionId: mapValueOfType<String>(json, r'board_section_id'),
        createdAt: mapDateTime(json, r'created_at', r''),
        creativeType: CreativeType.fromJson(json[r'creative_type']),
        dominantColor: mapValueOfType<String>(json, r'dominant_color'),
        hasBeenPromoted: mapValueOfType<bool>(json, r'has_been_promoted'),
        id: mapValueOfType<String>(json, r'id')!,
        isOwner: mapValueOfType<bool>(json, r'is_owner'),
        isProduct: mapValueOfType<bool>(json, r'is_product'),
        isStandard: mapValueOfType<bool>(json, r'is_standard'),
        media: PinMedia.fromJson(json[r'media']),
        parentPinId: mapValueOfType<String>(json, r'parent_pin_id'),
        pinMetrics: mapValueOfType<Object>(json, r'pin_metrics'),
      );
    }
    return null;
  }

  static List<PinBase> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinBase>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinBase.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinBase> mapFromJson(dynamic json) {
    final map = <String, PinBase>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinBase.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinBase-objects as value to a dart map
  static Map<String, List<PinBase>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinBase>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinBase.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

