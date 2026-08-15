//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderLine {
  /// Returns a new [OrderLine] instance.
  OrderLine({
    this.adAccountId,
    this.budget,
    this.endTime,
    this.id,
    this.name,
    this.paidBudget,
    this.paidType,
    this.purchaseOrderId,
    this.startTime,
    this.status,
    this.type,
    this.campaignIds = const [],
  });

  /// Ad account ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Order line budget in micro currency.
  num? budget;

  /// End time. Unix timestamp.
  num? endTime;

  /// Order line ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Order line name.
  String? name;

  /// Order line paid budget in micro currency.
  num? paidBudget;

  /// Order line paid type.
  OrderLinePaidType? paidType;

  /// Purchase order ID.
  String? purchaseOrderId;

  /// Start time. Unix timestamp.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? startTime;

  /// Order line status.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderLineStatus? status;

  /// Always \"orderline\".
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  /// Associated List of campaign IDs.
  List<String> campaignIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderLine &&
    other.adAccountId == adAccountId &&
    other.budget == budget &&
    other.endTime == endTime &&
    other.id == id &&
    other.name == name &&
    other.paidBudget == paidBudget &&
    other.paidType == paidType &&
    other.purchaseOrderId == purchaseOrderId &&
    other.startTime == startTime &&
    other.status == status &&
    other.type == type &&
    _deepEquality.equals(other.campaignIds, campaignIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (budget == null ? 0 : budget!.hashCode) +
    (endTime == null ? 0 : endTime!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (paidBudget == null ? 0 : paidBudget!.hashCode) +
    (paidType == null ? 0 : paidType!.hashCode) +
    (purchaseOrderId == null ? 0 : purchaseOrderId!.hashCode) +
    (startTime == null ? 0 : startTime!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (campaignIds.hashCode);

  @override
  String toString() => 'OrderLine[adAccountId=$adAccountId, budget=$budget, endTime=$endTime, id=$id, name=$name, paidBudget=$paidBudget, paidType=$paidType, purchaseOrderId=$purchaseOrderId, startTime=$startTime, status=$status, type=$type, campaignIds=$campaignIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.budget != null) {
      json[r'budget'] = this.budget;
    } else {
      json[r'budget'] = null;
    }
    if (this.endTime != null) {
      json[r'end_time'] = this.endTime;
    } else {
      json[r'end_time'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.paidBudget != null) {
      json[r'paid_budget'] = this.paidBudget;
    } else {
      json[r'paid_budget'] = null;
    }
    if (this.paidType != null) {
      json[r'paid_type'] = this.paidType;
    } else {
      json[r'paid_type'] = null;
    }
    if (this.purchaseOrderId != null) {
      json[r'purchase_order_id'] = this.purchaseOrderId;
    } else {
      json[r'purchase_order_id'] = null;
    }
    if (this.startTime != null) {
      json[r'start_time'] = this.startTime;
    } else {
      json[r'start_time'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
      json[r'campaign_ids'] = this.campaignIds;
    return json;
  }

  /// Returns a new [OrderLine] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderLine? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderLine[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderLine[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderLine(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        budget: json[r'budget'] == null
            ? null
            : num.parse('${json[r'budget']}'),
        endTime: json[r'end_time'] == null
            ? null
            : num.parse('${json[r'end_time']}'),
        id: mapValueOfType<String>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        paidBudget: json[r'paid_budget'] == null
            ? null
            : num.parse('${json[r'paid_budget']}'),
        paidType: OrderLinePaidType.fromJson(json[r'paid_type']),
        purchaseOrderId: mapValueOfType<String>(json, r'purchase_order_id'),
        startTime: num.parse('${json[r'start_time']}'),
        status: OrderLineStatus.fromJson(json[r'status']),
        type: mapValueOfType<String>(json, r'type'),
        campaignIds: json[r'campaign_ids'] is Iterable
            ? (json[r'campaign_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<OrderLine> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderLine>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderLine.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderLine> mapFromJson(dynamic json) {
    final map = <String, OrderLine>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderLine.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderLine-objects as value to a dart map
  static Map<String, List<OrderLine>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderLine>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderLine.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaign_ids',
  };
}

