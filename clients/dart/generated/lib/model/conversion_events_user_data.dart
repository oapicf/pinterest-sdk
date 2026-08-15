//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionEventsUserData {
  /// Returns a new [ConversionEventsUserData] instance.
  ConversionEventsUserData({
    this.clickId,
    this.clientIpAddress,
    this.clientUserAgent,
    this.country = const [],
    this.ct = const [],
    this.db = const [],
    this.em = const [],
    this.externalId = const [],
    this.fn = const [],
    this.ge = const [],
    this.hashedMaids = const [],
    this.ln = const [],
    this.partnerId,
    this.ph = const [],
    this.st = const [],
    this.zp = const [],
  });

  /// The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
  String? clickId;

  /// The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? clientIpAddress;

  /// The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? clientUserAgent;

  /// Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
  List<String> country;

  /// Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
  List<String> ct;

  /// Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
  List<String> db;

  /// Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  List<String> em;

  /// Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  List<String> externalId;

  /// Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  List<String> fn;

  /// Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
  List<String> ge;

  /// Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  List<String> hashedMaids;

  /// Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  List<String> ln;

  /// A unique identifier of visitors' information defined by third party partners. e.g RampID
  String? partnerId;

  /// Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  List<String> ph;

  /// Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
  List<String> st;

  /// Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
  List<String> zp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionEventsUserData &&
    other.clickId == clickId &&
    other.clientIpAddress == clientIpAddress &&
    other.clientUserAgent == clientUserAgent &&
    _deepEquality.equals(other.country, country) &&
    _deepEquality.equals(other.ct, ct) &&
    _deepEquality.equals(other.db, db) &&
    _deepEquality.equals(other.em, em) &&
    _deepEquality.equals(other.externalId, externalId) &&
    _deepEquality.equals(other.fn, fn) &&
    _deepEquality.equals(other.ge, ge) &&
    _deepEquality.equals(other.hashedMaids, hashedMaids) &&
    _deepEquality.equals(other.ln, ln) &&
    other.partnerId == partnerId &&
    _deepEquality.equals(other.ph, ph) &&
    _deepEquality.equals(other.st, st) &&
    _deepEquality.equals(other.zp, zp);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (clickId == null ? 0 : clickId!.hashCode) +
    (clientIpAddress == null ? 0 : clientIpAddress!.hashCode) +
    (clientUserAgent == null ? 0 : clientUserAgent!.hashCode) +
    (country.hashCode) +
    (ct.hashCode) +
    (db.hashCode) +
    (em.hashCode) +
    (externalId.hashCode) +
    (fn.hashCode) +
    (ge.hashCode) +
    (hashedMaids.hashCode) +
    (ln.hashCode) +
    (partnerId == null ? 0 : partnerId!.hashCode) +
    (ph.hashCode) +
    (st.hashCode) +
    (zp.hashCode);

  @override
  String toString() => 'ConversionEventsUserData[clickId=$clickId, clientIpAddress=$clientIpAddress, clientUserAgent=$clientUserAgent, country=$country, ct=$ct, db=$db, em=$em, externalId=$externalId, fn=$fn, ge=$ge, hashedMaids=$hashedMaids, ln=$ln, partnerId=$partnerId, ph=$ph, st=$st, zp=$zp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.clickId != null) {
      json[r'click_id'] = this.clickId;
    } else {
      json[r'click_id'] = null;
    }
    if (this.clientIpAddress != null) {
      json[r'client_ip_address'] = this.clientIpAddress;
    } else {
      json[r'client_ip_address'] = null;
    }
    if (this.clientUserAgent != null) {
      json[r'client_user_agent'] = this.clientUserAgent;
    } else {
      json[r'client_user_agent'] = null;
    }
      json[r'country'] = this.country;
      json[r'ct'] = this.ct;
      json[r'db'] = this.db;
      json[r'em'] = this.em;
      json[r'external_id'] = this.externalId;
      json[r'fn'] = this.fn;
      json[r'ge'] = this.ge;
      json[r'hashed_maids'] = this.hashedMaids;
      json[r'ln'] = this.ln;
    if (this.partnerId != null) {
      json[r'partner_id'] = this.partnerId;
    } else {
      json[r'partner_id'] = null;
    }
      json[r'ph'] = this.ph;
      json[r'st'] = this.st;
      json[r'zp'] = this.zp;
    return json;
  }

  /// Returns a new [ConversionEventsUserData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionEventsUserData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionEventsUserData[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionEventsUserData[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionEventsUserData(
        clickId: mapValueOfType<String>(json, r'click_id'),
        clientIpAddress: mapValueOfType<String>(json, r'client_ip_address'),
        clientUserAgent: mapValueOfType<String>(json, r'client_user_agent'),
        country: json[r'country'] is Iterable
            ? (json[r'country'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        ct: json[r'ct'] is Iterable
            ? (json[r'ct'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        db: json[r'db'] is Iterable
            ? (json[r'db'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        em: json[r'em'] is Iterable
            ? (json[r'em'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        externalId: json[r'external_id'] is Iterable
            ? (json[r'external_id'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        fn: json[r'fn'] is Iterable
            ? (json[r'fn'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        ge: json[r'ge'] is Iterable
            ? (json[r'ge'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        hashedMaids: json[r'hashed_maids'] is Iterable
            ? (json[r'hashed_maids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        ln: json[r'ln'] is Iterable
            ? (json[r'ln'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        partnerId: mapValueOfType<String>(json, r'partner_id'),
        ph: json[r'ph'] is Iterable
            ? (json[r'ph'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        st: json[r'st'] is Iterable
            ? (json[r'st'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        zp: json[r'zp'] is Iterable
            ? (json[r'zp'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ConversionEventsUserData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventsUserData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventsUserData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionEventsUserData> mapFromJson(dynamic json) {
    final map = <String, ConversionEventsUserData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionEventsUserData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionEventsUserData-objects as value to a dart map
  static Map<String, List<ConversionEventsUserData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionEventsUserData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionEventsUserData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

