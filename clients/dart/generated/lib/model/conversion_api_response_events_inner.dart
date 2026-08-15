//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionApiResponseEventsInner {
  /// Returns a new [ConversionApiResponseEventsInner] instance.
  ConversionApiResponseEventsInner({
    this.errorMessage,
    required this.status,
    this.warningMessage,
  });

  /// Error message containing more information about why the event failed to be processed.
  String? errorMessage;

  /// Whether the event was processed successfully.
  ConversionApiResponseEventsInnerStatusEnum status;

  /// Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  String? warningMessage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionApiResponseEventsInner &&
    other.errorMessage == errorMessage &&
    other.status == status &&
    other.warningMessage == warningMessage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errorMessage == null ? 0 : errorMessage!.hashCode) +
    (status.hashCode) +
    (warningMessage == null ? 0 : warningMessage!.hashCode);

  @override
  String toString() => 'ConversionApiResponseEventsInner[errorMessage=$errorMessage, status=$status, warningMessage=$warningMessage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.errorMessage != null) {
      json[r'error_message'] = this.errorMessage;
    } else {
      json[r'error_message'] = null;
    }
      json[r'status'] = this.status;
    if (this.warningMessage != null) {
      json[r'warning_message'] = this.warningMessage;
    } else {
      json[r'warning_message'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionApiResponseEventsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionApiResponseEventsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionApiResponseEventsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionApiResponseEventsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionApiResponseEventsInner(
        errorMessage: mapValueOfType<String>(json, r'error_message'),
        status: ConversionApiResponseEventsInnerStatusEnum.fromJson(json[r'status'])!,
        warningMessage: mapValueOfType<String>(json, r'warning_message'),
      );
    }
    return null;
  }

  static List<ConversionApiResponseEventsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionApiResponseEventsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionApiResponseEventsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionApiResponseEventsInner> mapFromJson(dynamic json) {
    final map = <String, ConversionApiResponseEventsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionApiResponseEventsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionApiResponseEventsInner-objects as value to a dart map
  static Map<String, List<ConversionApiResponseEventsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionApiResponseEventsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionApiResponseEventsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'status',
  };
}

/// Whether the event was processed successfully.
class ConversionApiResponseEventsInnerStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionApiResponseEventsInnerStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const failed = ConversionApiResponseEventsInnerStatusEnum._(r'failed');
  static const processed = ConversionApiResponseEventsInnerStatusEnum._(r'processed');

  /// List of all possible values in this [enum][ConversionApiResponseEventsInnerStatusEnum].
  static const values = <ConversionApiResponseEventsInnerStatusEnum>[
    failed,
    processed,
  ];

  static ConversionApiResponseEventsInnerStatusEnum? fromJson(dynamic value) => ConversionApiResponseEventsInnerStatusEnumTypeTransformer().decode(value);

  static List<ConversionApiResponseEventsInnerStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionApiResponseEventsInnerStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionApiResponseEventsInnerStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionApiResponseEventsInnerStatusEnum] to String,
/// and [decode] dynamic data back to [ConversionApiResponseEventsInnerStatusEnum].
class ConversionApiResponseEventsInnerStatusEnumTypeTransformer {
  factory ConversionApiResponseEventsInnerStatusEnumTypeTransformer() => _instance ??= const ConversionApiResponseEventsInnerStatusEnumTypeTransformer._();

  const ConversionApiResponseEventsInnerStatusEnumTypeTransformer._();

  String encode(ConversionApiResponseEventsInnerStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionApiResponseEventsInnerStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionApiResponseEventsInnerStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'failed': return ConversionApiResponseEventsInnerStatusEnum.failed;
        case r'processed': return ConversionApiResponseEventsInnerStatusEnum.processed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionApiResponseEventsInnerStatusEnumTypeTransformer] instance.
  static ConversionApiResponseEventsInnerStatusEnumTypeTransformer? _instance;
}


