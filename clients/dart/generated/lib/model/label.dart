//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Label {
  /// Returns a new [Label] instance.
  Label({
    required this.id,
    required this.labelType,
    this.status,
    required this.value,
  });

  /// Label ID.
  String id;

  NullableLabelType? labelType;

  NullableLabelStatus? status;

  /// Label name. 100-character limit.
  String value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Label &&
    other.id == id &&
    other.labelType == labelType &&
    other.status == status &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (labelType == null ? 0 : labelType!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'Label[id=$id, labelType=$labelType, status=$status, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
    if (this.labelType != null) {
      json[r'label_type'] = this.labelType;
    } else {
      json[r'label_type'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [Label] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Label? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "Label[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "Label[id]" has a null value in JSON.');
        assert(json.containsKey(r'label_type'), 'Required key "Label[label_type]" is missing from JSON.');
        assert(json.containsKey(r'value'), 'Required key "Label[value]" is missing from JSON.');
        assert(json[r'value'] != null, 'Required key "Label[value]" has a null value in JSON.');
        return true;
      }());

      return Label(
        id: mapValueOfType<String>(json, r'id')!,
        labelType: NullableLabelType.fromJson(json[r'label_type']),
        status: NullableLabelStatus.fromJson(json[r'status']),
        value: mapValueOfType<String>(json, r'value')!,
      );
    }
    return null;
  }

  static List<Label> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Label>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Label.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Label> mapFromJson(dynamic json) {
    final map = <String, Label>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Label.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Label-objects as value to a dart map
  static Map<String, List<Label>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Label>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Label.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'label_type',
    'value',
  };
}

