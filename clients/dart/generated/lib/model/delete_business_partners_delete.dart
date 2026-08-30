//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteBusinessPartnersDelete {
  /// Returns a new [DeleteBusinessPartnersDelete] instance.
  DeleteBusinessPartnersDelete({
    this.partnerIds = const [],
    this.partnerType,
  });

  /// A list of partner ids to be deleted
  List<String> partnerIds;

  NullablePartnerType? partnerType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteBusinessPartnersDelete &&
    _deepEquality.equals(other.partnerIds, partnerIds) &&
    other.partnerType == partnerType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (partnerIds.hashCode) +
    (partnerType == null ? 0 : partnerType!.hashCode);

  @override
  String toString() => 'DeleteBusinessPartnersDelete[partnerIds=$partnerIds, partnerType=$partnerType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'partner_ids'] = this.partnerIds;
    if (this.partnerType != null) {
      json[r'partner_type'] = this.partnerType;
    } else {
      json[r'partner_type'] = null;
    }
    return json;
  }

  /// Returns a new [DeleteBusinessPartnersDelete] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteBusinessPartnersDelete? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'partner_ids'), 'Required key "DeleteBusinessPartnersDelete[partner_ids]" is missing from JSON.');
        assert(json[r'partner_ids'] != null, 'Required key "DeleteBusinessPartnersDelete[partner_ids]" has a null value in JSON.');
        return true;
      }());

      return DeleteBusinessPartnersDelete(
        partnerIds: json[r'partner_ids'] is Iterable
            ? (json[r'partner_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        partnerType: NullablePartnerType.fromJson(json[r'partner_type']),
      );
    }
    return null;
  }

  static List<DeleteBusinessPartnersDelete> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteBusinessPartnersDelete>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteBusinessPartnersDelete.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteBusinessPartnersDelete> mapFromJson(dynamic json) {
    final map = <String, DeleteBusinessPartnersDelete>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteBusinessPartnersDelete.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteBusinessPartnersDelete-objects as value to a dart map
  static Map<String, List<DeleteBusinessPartnersDelete>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteBusinessPartnersDelete>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteBusinessPartnersDelete.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'partner_ids',
  };
}

