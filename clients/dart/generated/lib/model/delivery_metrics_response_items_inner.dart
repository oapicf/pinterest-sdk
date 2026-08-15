//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeliveryMetricsResponseItemsInner {
  /// Returns a new [DeliveryMetricsResponseItemsInner] instance.
  DeliveryMetricsResponseItemsInner({
    this.category,
    this.definition,
    this.displayName,
    this.name,
  });

  /// Category name
  DeliveryMetricsResponseItemsInnerCategoryEnum? category;

  /// How the metric is defined.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? definition;

  /// Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? displayName;

  /// Metric's name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeliveryMetricsResponseItemsInner &&
    other.category == category &&
    other.definition == definition &&
    other.displayName == displayName &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (category == null ? 0 : category!.hashCode) +
    (definition == null ? 0 : definition!.hashCode) +
    (displayName == null ? 0 : displayName!.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'DeliveryMetricsResponseItemsInner[category=$category, definition=$definition, displayName=$displayName, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.category != null) {
      json[r'category'] = this.category;
    } else {
      json[r'category'] = null;
    }
    if (this.definition != null) {
      json[r'definition'] = this.definition;
    } else {
      json[r'definition'] = null;
    }
    if (this.displayName != null) {
      json[r'display_name'] = this.displayName;
    } else {
      json[r'display_name'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [DeliveryMetricsResponseItemsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeliveryMetricsResponseItemsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeliveryMetricsResponseItemsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeliveryMetricsResponseItemsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeliveryMetricsResponseItemsInner(
        category: DeliveryMetricsResponseItemsInnerCategoryEnum.fromJson(json[r'category']),
        definition: mapValueOfType<String>(json, r'definition'),
        displayName: mapValueOfType<String>(json, r'display_name'),
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<DeliveryMetricsResponseItemsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeliveryMetricsResponseItemsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeliveryMetricsResponseItemsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeliveryMetricsResponseItemsInner> mapFromJson(dynamic json) {
    final map = <String, DeliveryMetricsResponseItemsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeliveryMetricsResponseItemsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeliveryMetricsResponseItemsInner-objects as value to a dart map
  static Map<String, List<DeliveryMetricsResponseItemsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeliveryMetricsResponseItemsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeliveryMetricsResponseItemsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Category name
class DeliveryMetricsResponseItemsInnerCategoryEnum {
  /// Instantiate a new enum with the provided [value].
  const DeliveryMetricsResponseItemsInnerCategoryEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ADS = DeliveryMetricsResponseItemsInnerCategoryEnum._(r'ADS');
  static const ORGANIC = DeliveryMetricsResponseItemsInnerCategoryEnum._(r'ORGANIC');

  /// List of all possible values in this [enum][DeliveryMetricsResponseItemsInnerCategoryEnum].
  static const values = <DeliveryMetricsResponseItemsInnerCategoryEnum>[
    ADS,
    ORGANIC,
  ];

  static DeliveryMetricsResponseItemsInnerCategoryEnum? fromJson(dynamic value) => DeliveryMetricsResponseItemsInnerCategoryEnumTypeTransformer().decode(value);

  static List<DeliveryMetricsResponseItemsInnerCategoryEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeliveryMetricsResponseItemsInnerCategoryEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeliveryMetricsResponseItemsInnerCategoryEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeliveryMetricsResponseItemsInnerCategoryEnum] to String,
/// and [decode] dynamic data back to [DeliveryMetricsResponseItemsInnerCategoryEnum].
class DeliveryMetricsResponseItemsInnerCategoryEnumTypeTransformer {
  factory DeliveryMetricsResponseItemsInnerCategoryEnumTypeTransformer() => _instance ??= const DeliveryMetricsResponseItemsInnerCategoryEnumTypeTransformer._();

  const DeliveryMetricsResponseItemsInnerCategoryEnumTypeTransformer._();

  String encode(DeliveryMetricsResponseItemsInnerCategoryEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DeliveryMetricsResponseItemsInnerCategoryEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeliveryMetricsResponseItemsInnerCategoryEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ADS': return DeliveryMetricsResponseItemsInnerCategoryEnum.ADS;
        case r'ORGANIC': return DeliveryMetricsResponseItemsInnerCategoryEnum.ORGANIC;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DeliveryMetricsResponseItemsInnerCategoryEnumTypeTransformer] instance.
  static DeliveryMetricsResponseItemsInnerCategoryEnumTypeTransformer? _instance;
}


