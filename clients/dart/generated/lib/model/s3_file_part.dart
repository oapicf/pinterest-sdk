//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class S3FilePart {
  /// Returns a new [S3FilePart] instance.
  S3FilePart({
    required this.partNumber,
    required this.presignedUrl,
  });

  /// Part number for upload.
  int partNumber;

  /// Pre-signed URL.
  String presignedUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is S3FilePart &&
    other.partNumber == partNumber &&
    other.presignedUrl == presignedUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (partNumber.hashCode) +
    (presignedUrl.hashCode);

  @override
  String toString() => 'S3FilePart[partNumber=$partNumber, presignedUrl=$presignedUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'part_number'] = this.partNumber;
      json[r'presigned_url'] = this.presignedUrl;
    return json;
  }

  /// Returns a new [S3FilePart] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static S3FilePart? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'part_number'), 'Required key "S3FilePart[part_number]" is missing from JSON.');
        assert(json[r'part_number'] != null, 'Required key "S3FilePart[part_number]" has a null value in JSON.');
        assert(json.containsKey(r'presigned_url'), 'Required key "S3FilePart[presigned_url]" is missing from JSON.');
        assert(json[r'presigned_url'] != null, 'Required key "S3FilePart[presigned_url]" has a null value in JSON.');
        return true;
      }());

      return S3FilePart(
        partNumber: mapValueOfType<int>(json, r'part_number')!,
        presignedUrl: mapValueOfType<String>(json, r'presigned_url')!,
      );
    }
    return null;
  }

  static List<S3FilePart> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <S3FilePart>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = S3FilePart.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, S3FilePart> mapFromJson(dynamic json) {
    final map = <String, S3FilePart>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = S3FilePart.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of S3FilePart-objects as value to a dart map
  static Map<String, List<S3FilePart>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<S3FilePart>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = S3FilePart.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'part_number',
    'presigned_url',
  };
}

