//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteAssetGroupResponseExceptionsInner {
  /// Returns a new [DeleteAssetGroupResponseExceptionsInner] instance.
  DeleteAssetGroupResponseExceptionsInner({
    this.assetGroupId,
    this.code,
    this.message,
  });

  /// Asset group id of the exception.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? assetGroupId;

  /// Error code associated with the error deleting asset group.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? code;

  /// Error message associated with the error deleting asset group.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteAssetGroupResponseExceptionsInner &&
    other.assetGroupId == assetGroupId &&
    other.code == code &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroupId == null ? 0 : assetGroupId!.hashCode) +
    (code == null ? 0 : code!.hashCode) +
    (message == null ? 0 : message!.hashCode);

  @override
  String toString() => 'DeleteAssetGroupResponseExceptionsInner[assetGroupId=$assetGroupId, code=$code, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.assetGroupId != null) {
      json[r'asset_group_id'] = this.assetGroupId;
    } else {
      json[r'asset_group_id'] = null;
    }
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    return json;
  }

  /// Returns a new [DeleteAssetGroupResponseExceptionsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteAssetGroupResponseExceptionsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteAssetGroupResponseExceptionsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteAssetGroupResponseExceptionsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteAssetGroupResponseExceptionsInner(
        assetGroupId: mapValueOfType<String>(json, r'asset_group_id'),
        code: mapValueOfType<int>(json, r'code'),
        message: mapValueOfType<String>(json, r'message'),
      );
    }
    return null;
  }

  static List<DeleteAssetGroupResponseExceptionsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteAssetGroupResponseExceptionsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteAssetGroupResponseExceptionsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteAssetGroupResponseExceptionsInner> mapFromJson(dynamic json) {
    final map = <String, DeleteAssetGroupResponseExceptionsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteAssetGroupResponseExceptionsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteAssetGroupResponseExceptionsInner-objects as value to a dart map
  static Map<String, List<DeleteAssetGroupResponseExceptionsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteAssetGroupResponseExceptionsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteAssetGroupResponseExceptionsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

