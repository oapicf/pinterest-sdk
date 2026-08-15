//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionHealthSelectionItem {
  /// Returns a new [ConversionHealthSelectionItem] instance.
  ConversionHealthSelectionItem({
    this.conversionType,
    this.criteria,
    this.ingestionSource,
    required this.status,
  });

  /// Status for conversion types
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? conversionType;

  /// Status for criteria
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? criteria;

  /// Status for ingestion sources
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? ingestionSource;

  /// Overall status for this selection item
  Object? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionHealthSelectionItem &&
    other.conversionType == conversionType &&
    other.criteria == criteria &&
    other.ingestionSource == ingestionSource &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (conversionType == null ? 0 : conversionType!.hashCode) +
    (criteria == null ? 0 : criteria!.hashCode) +
    (ingestionSource == null ? 0 : ingestionSource!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'ConversionHealthSelectionItem[conversionType=$conversionType, criteria=$criteria, ingestionSource=$ingestionSource, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.conversionType != null) {
      json[r'conversionType'] = this.conversionType;
    } else {
      json[r'conversionType'] = null;
    }
    if (this.criteria != null) {
      json[r'criteria'] = this.criteria;
    } else {
      json[r'criteria'] = null;
    }
    if (this.ingestionSource != null) {
      json[r'ingestionSource'] = this.ingestionSource;
    } else {
      json[r'ingestionSource'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionHealthSelectionItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionHealthSelectionItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionHealthSelectionItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionHealthSelectionItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionHealthSelectionItem(
        conversionType: mapValueOfType<Object>(json, r'conversionType'),
        criteria: mapValueOfType<Object>(json, r'criteria'),
        ingestionSource: mapValueOfType<Object>(json, r'ingestionSource'),
        status: mapValueOfType<Object>(json, r'status'),
      );
    }
    return null;
  }

  static List<ConversionHealthSelectionItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionHealthSelectionItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionHealthSelectionItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionHealthSelectionItem> mapFromJson(dynamic json) {
    final map = <String, ConversionHealthSelectionItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionHealthSelectionItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionHealthSelectionItem-objects as value to a dart map
  static Map<String, List<ConversionHealthSelectionItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionHealthSelectionItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionHealthSelectionItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'status',
  };
}

