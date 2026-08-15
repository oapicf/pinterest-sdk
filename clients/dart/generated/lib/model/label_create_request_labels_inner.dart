//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LabelCreateRequestLabelsInner {
  /// Returns a new [LabelCreateRequestLabelsInner] instance.
  LabelCreateRequestLabelsInner({
    required this.labelType,
    required this.value,
  });

  LabelType? labelType;

  /// Label name. 100-character limit.
  String value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LabelCreateRequestLabelsInner &&
    other.labelType == labelType &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (labelType == null ? 0 : labelType!.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'LabelCreateRequestLabelsInner[labelType=$labelType, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.labelType != null) {
      json[r'label_type'] = this.labelType;
    } else {
      json[r'label_type'] = null;
    }
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [LabelCreateRequestLabelsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LabelCreateRequestLabelsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LabelCreateRequestLabelsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LabelCreateRequestLabelsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LabelCreateRequestLabelsInner(
        labelType: LabelType.fromJson(json[r'label_type']),
        value: mapValueOfType<String>(json, r'value')!,
      );
    }
    return null;
  }

  static List<LabelCreateRequestLabelsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelCreateRequestLabelsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelCreateRequestLabelsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LabelCreateRequestLabelsInner> mapFromJson(dynamic json) {
    final map = <String, LabelCreateRequestLabelsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LabelCreateRequestLabelsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LabelCreateRequestLabelsInner-objects as value to a dart map
  static Map<String, List<LabelCreateRequestLabelsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LabelCreateRequestLabelsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LabelCreateRequestLabelsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'label_type',
    'value',
  };
}

