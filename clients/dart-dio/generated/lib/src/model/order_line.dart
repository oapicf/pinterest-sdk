//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/order_line_paid_type.dart';
import 'package:openapi/src/model/order_lines.dart';
import 'package:openapi/src/model/order_line_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_line.g.dart';

/// OrderLine
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [budget] - Order line budget in micro currency.
/// * [endTime] - End time. Unix timestamp.
/// * [id] - Order line ID.
/// * [name] - Order line name.
/// * [paidBudget] - Order line paid budget in micro currency.
/// * [paidType] - Order line paid type.
/// * [purchaseOrderId] - Purchase order ID.
/// * [startTime] - Start time. Unix timestamp.
/// * [status] - Order line status.
/// * [type] - Always \"orderline\".
/// * [campaignIds] - Associated List of campaign IDs.
@BuiltValue()
abstract class OrderLine implements OrderLines, Built<OrderLine, OrderLineBuilder> {
  /// Associated List of campaign IDs.
  @BuiltValueField(wireName: r'campaign_ids')
  BuiltList<String> get campaignIds;

  OrderLine._();

  factory OrderLine([void updates(OrderLineBuilder b)]) = _$OrderLine;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLineBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLine> get serializer => _$OrderLineSerializer();
}

class _$OrderLineSerializer implements PrimitiveSerializer<OrderLine> {
  @override
  final Iterable<Type> types = const [OrderLine, _$OrderLine];

  @override
  final String wireName = r'OrderLine';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLine object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.paidType != null) {
      yield r'paid_type';
      yield serializers.serialize(
        object.paidType,
        specifiedType: const FullType.nullable(OrderLinePaidType),
      );
    }
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.purchaseOrderId != null) {
      yield r'purchase_order_id';
      yield serializers.serialize(
        object.purchaseOrderId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.paidBudget != null) {
      yield r'paid_budget';
      yield serializers.serialize(
        object.paidBudget,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType(num),
      );
    }
    yield r'campaign_ids';
    yield serializers.serialize(
      object.campaignIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    if (object.endTime != null) {
      yield r'end_time';
      yield serializers.serialize(
        object.endTime,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.budget != null) {
      yield r'budget';
      yield serializers.serialize(
        object.budget,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(OrderLineStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrderLine object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLineBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'paid_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrderLinePaidType),
          ) as OrderLinePaidType?;
          if (valueDes == null) continue;
          result.paidType = valueDes;
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'purchase_order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.purchaseOrderId = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'paid_budget':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.paidBudget = valueDes;
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.startTime = valueDes;
          break;
        case r'campaign_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.campaignIds.replace(valueDes);
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.endTime = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        case r'budget':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.budget = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OrderLineStatus),
          ) as OrderLineStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrderLine deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLineBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

