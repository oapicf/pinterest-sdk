//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AppsflyerAudienceSyncCreate {
  /// Returns a new [AppsflyerAudienceSyncCreate] instance.
  AppsflyerAudienceSyncCreate({
    required this.containerId,
    this.urlAdidSha256,
    this.urlEmailSha256,
  });

  /// The container ID of the audience
  String containerId;

  /// The pre-signed URL for SHA256 hashed GAID/IDFA file
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? urlAdidSha256;

  /// The pre-signed URL for SHA256 hashed email file
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? urlEmailSha256;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AppsflyerAudienceSyncCreate &&
    other.containerId == containerId &&
    other.urlAdidSha256 == urlAdidSha256 &&
    other.urlEmailSha256 == urlEmailSha256;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (containerId.hashCode) +
    (urlAdidSha256 == null ? 0 : urlAdidSha256!.hashCode) +
    (urlEmailSha256 == null ? 0 : urlEmailSha256!.hashCode);

  @override
  String toString() => 'AppsflyerAudienceSyncCreate[containerId=$containerId, urlAdidSha256=$urlAdidSha256, urlEmailSha256=$urlEmailSha256]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'container_id'] = this.containerId;
    if (this.urlAdidSha256 != null) {
      json[r'url_adid_sha256'] = this.urlAdidSha256;
    } else {
      json[r'url_adid_sha256'] = null;
    }
    if (this.urlEmailSha256 != null) {
      json[r'url_email_sha256'] = this.urlEmailSha256;
    } else {
      json[r'url_email_sha256'] = null;
    }
    return json;
  }

  /// Returns a new [AppsflyerAudienceSyncCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AppsflyerAudienceSyncCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'container_id'), 'Required key "AppsflyerAudienceSyncCreate[container_id]" is missing from JSON.');
        assert(json[r'container_id'] != null, 'Required key "AppsflyerAudienceSyncCreate[container_id]" has a null value in JSON.');
        return true;
      }());

      return AppsflyerAudienceSyncCreate(
        containerId: mapValueOfType<String>(json, r'container_id')!,
        urlAdidSha256: mapValueOfType<String>(json, r'url_adid_sha256'),
        urlEmailSha256: mapValueOfType<String>(json, r'url_email_sha256'),
      );
    }
    return null;
  }

  static List<AppsflyerAudienceSyncCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AppsflyerAudienceSyncCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AppsflyerAudienceSyncCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AppsflyerAudienceSyncCreate> mapFromJson(dynamic json) {
    final map = <String, AppsflyerAudienceSyncCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AppsflyerAudienceSyncCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AppsflyerAudienceSyncCreate-objects as value to a dart map
  static Map<String, List<AppsflyerAudienceSyncCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AppsflyerAudienceSyncCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AppsflyerAudienceSyncCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'container_id',
  };
}

