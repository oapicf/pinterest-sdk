//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QualityComponents {
  /// Returns a new [QualityComponents] instance.
  QualityComponents({
    this.advertiserExternalId = const {},
    this.clickIdEpik = const {},
    this.externalEventId = const {},
    this.hashedEmail = const {},
    this.hashedMaid = const {},
    this.ipAddress = const {},
    this.orderId = const {},
    this.orderValue = const {},
    this.productId = const {},
    this.sourceUrl = const {},
    this.userAgent = const {},
  });

  Map<String, QualityComponentDetails> advertiserExternalId;

  Map<String, QualityComponentDetails> clickIdEpik;

  /// Dedup components.
  Map<String, QualityComponentDetails> externalEventId;

  /// User matching identifiers.
  Map<String, QualityComponentDetails> hashedEmail;

  Map<String, QualityComponentDetails> hashedMaid;

  Map<String, QualityComponentDetails> ipAddress;

  Map<String, QualityComponentDetails> orderId;

  Map<String, QualityComponentDetails> orderValue;

  /// Product/event metadata.
  Map<String, QualityComponentDetails> productId;

  Map<String, QualityComponentDetails> sourceUrl;

  Map<String, QualityComponentDetails> userAgent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QualityComponents &&
    _deepEquality.equals(other.advertiserExternalId, advertiserExternalId) &&
    _deepEquality.equals(other.clickIdEpik, clickIdEpik) &&
    _deepEquality.equals(other.externalEventId, externalEventId) &&
    _deepEquality.equals(other.hashedEmail, hashedEmail) &&
    _deepEquality.equals(other.hashedMaid, hashedMaid) &&
    _deepEquality.equals(other.ipAddress, ipAddress) &&
    _deepEquality.equals(other.orderId, orderId) &&
    _deepEquality.equals(other.orderValue, orderValue) &&
    _deepEquality.equals(other.productId, productId) &&
    _deepEquality.equals(other.sourceUrl, sourceUrl) &&
    _deepEquality.equals(other.userAgent, userAgent);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (advertiserExternalId.hashCode) +
    (clickIdEpik.hashCode) +
    (externalEventId.hashCode) +
    (hashedEmail.hashCode) +
    (hashedMaid.hashCode) +
    (ipAddress.hashCode) +
    (orderId.hashCode) +
    (orderValue.hashCode) +
    (productId.hashCode) +
    (sourceUrl.hashCode) +
    (userAgent.hashCode);

  @override
  String toString() => 'QualityComponents[advertiserExternalId=$advertiserExternalId, clickIdEpik=$clickIdEpik, externalEventId=$externalEventId, hashedEmail=$hashedEmail, hashedMaid=$hashedMaid, ipAddress=$ipAddress, orderId=$orderId, orderValue=$orderValue, productId=$productId, sourceUrl=$sourceUrl, userAgent=$userAgent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'advertiser_external_id'] = this.advertiserExternalId;
      json[r'click_id_epik'] = this.clickIdEpik;
      json[r'external_event_id'] = this.externalEventId;
      json[r'hashed_email'] = this.hashedEmail;
      json[r'hashed_maid'] = this.hashedMaid;
      json[r'ip_address'] = this.ipAddress;
      json[r'order_id'] = this.orderId;
      json[r'order_value'] = this.orderValue;
      json[r'product_id'] = this.productId;
      json[r'source_url'] = this.sourceUrl;
      json[r'user_agent'] = this.userAgent;
    return json;
  }

  /// Returns a new [QualityComponents] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QualityComponents? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return QualityComponents(
        advertiserExternalId: QualityComponentDetails.mapFromJson(json[r'advertiser_external_id']),
        clickIdEpik: QualityComponentDetails.mapFromJson(json[r'click_id_epik']),
        externalEventId: QualityComponentDetails.mapFromJson(json[r'external_event_id']),
        hashedEmail: QualityComponentDetails.mapFromJson(json[r'hashed_email']),
        hashedMaid: QualityComponentDetails.mapFromJson(json[r'hashed_maid']),
        ipAddress: QualityComponentDetails.mapFromJson(json[r'ip_address']),
        orderId: QualityComponentDetails.mapFromJson(json[r'order_id']),
        orderValue: QualityComponentDetails.mapFromJson(json[r'order_value']),
        productId: QualityComponentDetails.mapFromJson(json[r'product_id']),
        sourceUrl: QualityComponentDetails.mapFromJson(json[r'source_url']),
        userAgent: QualityComponentDetails.mapFromJson(json[r'user_agent']),
      );
    }
    return null;
  }

  static List<QualityComponents> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QualityComponents>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QualityComponents.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QualityComponents> mapFromJson(dynamic json) {
    final map = <String, QualityComponents>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QualityComponents.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QualityComponents-objects as value to a dart map
  static Map<String, List<QualityComponents>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QualityComponents>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QualityComponents.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

