//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionDeletionRequestTargets {
  /// Returns a new [ConversionDeletionRequestTargets] instance.
  ConversionDeletionRequestTargets({
    this.userEmails = const [],
    this.epiks = const [],
  });

  /// Array of plain text user emails.
  List<String> userEmails;

  /// Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
  List<String> epiks;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionDeletionRequestTargets &&
    _deepEquality.equals(other.userEmails, userEmails) &&
    _deepEquality.equals(other.epiks, epiks);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (userEmails.hashCode) +
    (epiks.hashCode);

  @override
  String toString() => 'ConversionDeletionRequestTargets[userEmails=$userEmails, epiks=$epiks]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'user_emails'] = this.userEmails;
      json[r'epiks'] = this.epiks;
    return json;
  }

  /// Returns a new [ConversionDeletionRequestTargets] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionDeletionRequestTargets? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'user_emails'), 'Required key "ConversionDeletionRequestTargets[user_emails]" is missing from JSON.');
        assert(json[r'user_emails'] != null, 'Required key "ConversionDeletionRequestTargets[user_emails]" has a null value in JSON.');
        assert(json.containsKey(r'epiks'), 'Required key "ConversionDeletionRequestTargets[epiks]" is missing from JSON.');
        assert(json[r'epiks'] != null, 'Required key "ConversionDeletionRequestTargets[epiks]" has a null value in JSON.');
        return true;
      }());

      return ConversionDeletionRequestTargets(
        userEmails: json[r'user_emails'] is Iterable
            ? (json[r'user_emails'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        epiks: json[r'epiks'] is Iterable
            ? (json[r'epiks'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ConversionDeletionRequestTargets> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionDeletionRequestTargets>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionDeletionRequestTargets.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionDeletionRequestTargets> mapFromJson(dynamic json) {
    final map = <String, ConversionDeletionRequestTargets>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionDeletionRequestTargets.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionDeletionRequestTargets-objects as value to a dart map
  static Map<String, List<ConversionDeletionRequestTargets>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionDeletionRequestTargets>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionDeletionRequestTargets.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'user_emails',
    'epiks',
  };
}

