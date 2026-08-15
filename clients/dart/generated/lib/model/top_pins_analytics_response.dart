//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TopPinsAnalyticsResponse {
  /// Returns a new [TopPinsAnalyticsResponse] instance.
  TopPinsAnalyticsResponse({
    this.dateAvailability,
    this.pins = const [],
    this.sortBy,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TopPinsAnalyticsResponseDateAvailability? dateAvailability;

  List<TopPinsAnalyticsResponsePinsInner> pins;

  TopPinsAnalyticsResponseSortByEnum? sortBy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TopPinsAnalyticsResponse &&
    other.dateAvailability == dateAvailability &&
    _deepEquality.equals(other.pins, pins) &&
    other.sortBy == sortBy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dateAvailability == null ? 0 : dateAvailability!.hashCode) +
    (pins.hashCode) +
    (sortBy == null ? 0 : sortBy!.hashCode);

  @override
  String toString() => 'TopPinsAnalyticsResponse[dateAvailability=$dateAvailability, pins=$pins, sortBy=$sortBy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dateAvailability != null) {
      json[r'date_availability'] = this.dateAvailability;
    } else {
      json[r'date_availability'] = null;
    }
      json[r'pins'] = this.pins;
    if (this.sortBy != null) {
      json[r'sort_by'] = this.sortBy;
    } else {
      json[r'sort_by'] = null;
    }
    return json;
  }

  /// Returns a new [TopPinsAnalyticsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TopPinsAnalyticsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TopPinsAnalyticsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TopPinsAnalyticsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TopPinsAnalyticsResponse(
        dateAvailability: TopPinsAnalyticsResponseDateAvailability.fromJson(json[r'date_availability']),
        pins: TopPinsAnalyticsResponsePinsInner.listFromJson(json[r'pins']),
        sortBy: TopPinsAnalyticsResponseSortByEnum.fromJson(json[r'sort_by']),
      );
    }
    return null;
  }

  static List<TopPinsAnalyticsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TopPinsAnalyticsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TopPinsAnalyticsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TopPinsAnalyticsResponse> mapFromJson(dynamic json) {
    final map = <String, TopPinsAnalyticsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TopPinsAnalyticsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TopPinsAnalyticsResponse-objects as value to a dart map
  static Map<String, List<TopPinsAnalyticsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TopPinsAnalyticsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TopPinsAnalyticsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class TopPinsAnalyticsResponseSortByEnum {
  /// Instantiate a new enum with the provided [value].
  const TopPinsAnalyticsResponseSortByEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ENGAGEMENT = TopPinsAnalyticsResponseSortByEnum._(r'ENGAGEMENT');
  static const SAVE = TopPinsAnalyticsResponseSortByEnum._(r'SAVE');
  static const IMPRESSION = TopPinsAnalyticsResponseSortByEnum._(r'IMPRESSION');
  static const OUTBOUND_CLICK = TopPinsAnalyticsResponseSortByEnum._(r'OUTBOUND_CLICK');
  static const PIN_CLICK = TopPinsAnalyticsResponseSortByEnum._(r'PIN_CLICK');

  /// List of all possible values in this [enum][TopPinsAnalyticsResponseSortByEnum].
  static const values = <TopPinsAnalyticsResponseSortByEnum>[
    ENGAGEMENT,
    SAVE,
    IMPRESSION,
    OUTBOUND_CLICK,
    PIN_CLICK,
  ];

  static TopPinsAnalyticsResponseSortByEnum? fromJson(dynamic value) => TopPinsAnalyticsResponseSortByEnumTypeTransformer().decode(value);

  static List<TopPinsAnalyticsResponseSortByEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TopPinsAnalyticsResponseSortByEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TopPinsAnalyticsResponseSortByEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TopPinsAnalyticsResponseSortByEnum] to String,
/// and [decode] dynamic data back to [TopPinsAnalyticsResponseSortByEnum].
class TopPinsAnalyticsResponseSortByEnumTypeTransformer {
  factory TopPinsAnalyticsResponseSortByEnumTypeTransformer() => _instance ??= const TopPinsAnalyticsResponseSortByEnumTypeTransformer._();

  const TopPinsAnalyticsResponseSortByEnumTypeTransformer._();

  String encode(TopPinsAnalyticsResponseSortByEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TopPinsAnalyticsResponseSortByEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TopPinsAnalyticsResponseSortByEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ENGAGEMENT': return TopPinsAnalyticsResponseSortByEnum.ENGAGEMENT;
        case r'SAVE': return TopPinsAnalyticsResponseSortByEnum.SAVE;
        case r'IMPRESSION': return TopPinsAnalyticsResponseSortByEnum.IMPRESSION;
        case r'OUTBOUND_CLICK': return TopPinsAnalyticsResponseSortByEnum.OUTBOUND_CLICK;
        case r'PIN_CLICK': return TopPinsAnalyticsResponseSortByEnum.PIN_CLICK;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TopPinsAnalyticsResponseSortByEnumTypeTransformer] instance.
  static TopPinsAnalyticsResponseSortByEnumTypeTransformer? _instance;
}


