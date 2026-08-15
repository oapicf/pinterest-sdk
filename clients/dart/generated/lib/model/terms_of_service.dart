//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TermsOfService {
  /// Returns a new [TermsOfService] instance.
  TermsOfService({
    this.adAccountId,
    this.hasAccepted,
    this.html,
    this.id,
  });

  /// The ID of the ad account.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Whether the ad account has accepted terms of service.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasAccepted;

  /// The terms of service content
  String? html;

  /// The ID of the terms of service
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TermsOfService &&
    other.adAccountId == adAccountId &&
    other.hasAccepted == hasAccepted &&
    other.html == html &&
    other.id == id;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (hasAccepted == null ? 0 : hasAccepted!.hashCode) +
    (html == null ? 0 : html!.hashCode) +
    (id == null ? 0 : id!.hashCode);

  @override
  String toString() => 'TermsOfService[adAccountId=$adAccountId, hasAccepted=$hasAccepted, html=$html, id=$id]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.hasAccepted != null) {
      json[r'has_accepted'] = this.hasAccepted;
    } else {
      json[r'has_accepted'] = null;
    }
    if (this.html != null) {
      json[r'html'] = this.html;
    } else {
      json[r'html'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    return json;
  }

  /// Returns a new [TermsOfService] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TermsOfService? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TermsOfService[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TermsOfService[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TermsOfService(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        hasAccepted: mapValueOfType<bool>(json, r'has_accepted'),
        html: mapValueOfType<String>(json, r'html'),
        id: mapValueOfType<String>(json, r'id'),
      );
    }
    return null;
  }

  static List<TermsOfService> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TermsOfService>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TermsOfService.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TermsOfService> mapFromJson(dynamic json) {
    final map = <String, TermsOfService>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TermsOfService.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TermsOfService-objects as value to a dart map
  static Map<String, List<TermsOfService>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TermsOfService>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TermsOfService.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

