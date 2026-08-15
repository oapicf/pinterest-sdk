//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TopVideoPinsAnalyticsResponse {
  /// Returns a new [TopVideoPinsAnalyticsResponse] instance.
  TopVideoPinsAnalyticsResponse({
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

  List<TopVideoPinsAnalyticsResponsePinsInner> pins;

  TopVideoPinsAnalyticsResponseSortByEnum? sortBy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TopVideoPinsAnalyticsResponse &&
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
  String toString() => 'TopVideoPinsAnalyticsResponse[dateAvailability=$dateAvailability, pins=$pins, sortBy=$sortBy]';

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

  /// Returns a new [TopVideoPinsAnalyticsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TopVideoPinsAnalyticsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TopVideoPinsAnalyticsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TopVideoPinsAnalyticsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TopVideoPinsAnalyticsResponse(
        dateAvailability: TopPinsAnalyticsResponseDateAvailability.fromJson(json[r'date_availability']),
        pins: TopVideoPinsAnalyticsResponsePinsInner.listFromJson(json[r'pins']),
        sortBy: TopVideoPinsAnalyticsResponseSortByEnum.fromJson(json[r'sort_by']),
      );
    }
    return null;
  }

  static List<TopVideoPinsAnalyticsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TopVideoPinsAnalyticsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TopVideoPinsAnalyticsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TopVideoPinsAnalyticsResponse> mapFromJson(dynamic json) {
    final map = <String, TopVideoPinsAnalyticsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TopVideoPinsAnalyticsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TopVideoPinsAnalyticsResponse-objects as value to a dart map
  static Map<String, List<TopVideoPinsAnalyticsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TopVideoPinsAnalyticsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TopVideoPinsAnalyticsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class TopVideoPinsAnalyticsResponseSortByEnum {
  /// Instantiate a new enum with the provided [value].
  const TopVideoPinsAnalyticsResponseSortByEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SAVE = TopVideoPinsAnalyticsResponseSortByEnum._(r'SAVE');
  static const IMPRESSION = TopVideoPinsAnalyticsResponseSortByEnum._(r'IMPRESSION');
  static const OUTBOUND_CLICK = TopVideoPinsAnalyticsResponseSortByEnum._(r'OUTBOUND_CLICK');
  static const VIDEO_MRC_VIEW = TopVideoPinsAnalyticsResponseSortByEnum._(r'VIDEO_MRC_VIEW');
  static const VIDEO_AVG_WATCH_TIME = TopVideoPinsAnalyticsResponseSortByEnum._(r'VIDEO_AVG_WATCH_TIME');
  static const vIDEOV50WATCHTIME = TopVideoPinsAnalyticsResponseSortByEnum._(r'VIDEO_V50_WATCH_TIME');
  static const qUARTILE95PERCENTVIEW = TopVideoPinsAnalyticsResponseSortByEnum._(r'QUARTILE_95_PERCENT_VIEW');
  static const vIDEO10SVIEW = TopVideoPinsAnalyticsResponseSortByEnum._(r'VIDEO_10S_VIEW');
  static const VIDEO_START = TopVideoPinsAnalyticsResponseSortByEnum._(r'VIDEO_START');

  /// List of all possible values in this [enum][TopVideoPinsAnalyticsResponseSortByEnum].
  static const values = <TopVideoPinsAnalyticsResponseSortByEnum>[
    SAVE,
    IMPRESSION,
    OUTBOUND_CLICK,
    VIDEO_MRC_VIEW,
    VIDEO_AVG_WATCH_TIME,
    vIDEOV50WATCHTIME,
    qUARTILE95PERCENTVIEW,
    vIDEO10SVIEW,
    VIDEO_START,
  ];

  static TopVideoPinsAnalyticsResponseSortByEnum? fromJson(dynamic value) => TopVideoPinsAnalyticsResponseSortByEnumTypeTransformer().decode(value);

  static List<TopVideoPinsAnalyticsResponseSortByEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TopVideoPinsAnalyticsResponseSortByEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TopVideoPinsAnalyticsResponseSortByEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TopVideoPinsAnalyticsResponseSortByEnum] to String,
/// and [decode] dynamic data back to [TopVideoPinsAnalyticsResponseSortByEnum].
class TopVideoPinsAnalyticsResponseSortByEnumTypeTransformer {
  factory TopVideoPinsAnalyticsResponseSortByEnumTypeTransformer() => _instance ??= const TopVideoPinsAnalyticsResponseSortByEnumTypeTransformer._();

  const TopVideoPinsAnalyticsResponseSortByEnumTypeTransformer._();

  String encode(TopVideoPinsAnalyticsResponseSortByEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TopVideoPinsAnalyticsResponseSortByEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TopVideoPinsAnalyticsResponseSortByEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SAVE': return TopVideoPinsAnalyticsResponseSortByEnum.SAVE;
        case r'IMPRESSION': return TopVideoPinsAnalyticsResponseSortByEnum.IMPRESSION;
        case r'OUTBOUND_CLICK': return TopVideoPinsAnalyticsResponseSortByEnum.OUTBOUND_CLICK;
        case r'VIDEO_MRC_VIEW': return TopVideoPinsAnalyticsResponseSortByEnum.VIDEO_MRC_VIEW;
        case r'VIDEO_AVG_WATCH_TIME': return TopVideoPinsAnalyticsResponseSortByEnum.VIDEO_AVG_WATCH_TIME;
        case r'VIDEO_V50_WATCH_TIME': return TopVideoPinsAnalyticsResponseSortByEnum.vIDEOV50WATCHTIME;
        case r'QUARTILE_95_PERCENT_VIEW': return TopVideoPinsAnalyticsResponseSortByEnum.qUARTILE95PERCENTVIEW;
        case r'VIDEO_10S_VIEW': return TopVideoPinsAnalyticsResponseSortByEnum.vIDEO10SVIEW;
        case r'VIDEO_START': return TopVideoPinsAnalyticsResponseSortByEnum.VIDEO_START;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TopVideoPinsAnalyticsResponseSortByEnumTypeTransformer] instance.
  static TopVideoPinsAnalyticsResponseSortByEnumTypeTransformer? _instance;
}


