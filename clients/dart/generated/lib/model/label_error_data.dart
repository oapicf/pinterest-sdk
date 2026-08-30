//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LabelErrorData {
  /// Returns a new [LabelErrorData] instance.
  LabelErrorData({
    this.id,
    this.labelType,
    this.status,
    this.value,
  });

  /// Label ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  NullableLabelType? labelType;

  NullableLabelStatus? status;

  /// Label name. 100-character limit.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LabelErrorData &&
    other.id == id &&
    other.labelType == labelType &&
    other.status == status &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (labelType == null ? 0 : labelType!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (value == null ? 0 : value!.hashCode);

  @override
  String toString() => 'LabelErrorData[id=$id, labelType=$labelType, status=$status, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
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
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    return json;
  }

  /// Returns a new [LabelErrorData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LabelErrorData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return LabelErrorData(
        id: mapValueOfType<String>(json, r'id'),
        labelType: NullableLabelType.fromJson(json[r'label_type']),
        status: NullableLabelStatus.fromJson(json[r'status']),
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<LabelErrorData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelErrorData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelErrorData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LabelErrorData> mapFromJson(dynamic json) {
    final map = <String, LabelErrorData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LabelErrorData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LabelErrorData-objects as value to a dart map
  static Map<String, List<LabelErrorData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LabelErrorData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LabelErrorData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

