//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/order_line_paid_type.dart';
import 'package:openapi/src/model/order_line_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_lines.g.dart';

/// Order Line
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
@BuiltValue(instantiable: false)
abstract class OrderLines  {
  /// Ad account ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Order line budget in micro currency.
  @BuiltValueField(wireName: r'budget')
  num? get budget;

  /// End time. Unix timestamp.
  @BuiltValueField(wireName: r'end_time')
  num? get endTime;

  /// Order line ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Order line name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Order line paid budget in micro currency.
  @BuiltValueField(wireName: r'paid_budget')
  num? get paidBudget;

  /// Order line paid type.
  @BuiltValueField(wireName: r'paid_type')
  OrderLinePaidType? get paidType;
  // enum paidTypeEnum {  PAID,  BONUS,  MAKE_GOOD,  TEST,  ,  };

  /// Purchase order ID.
  @BuiltValueField(wireName: r'purchase_order_id')
  String? get purchaseOrderId;

  /// Start time. Unix timestamp.
  @BuiltValueField(wireName: r'start_time')
  num? get startTime;

  /// Order line status.
  @BuiltValueField(wireName: r'status')
  OrderLineStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  DELETED,  };

  /// Always \"orderline\".
  @BuiltValueField(wireName: r'type')
  String? get type;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLines> get serializer => _$OrderLinesSerializer();
}

class _$OrderLinesSerializer implements PrimitiveSerializer<OrderLines> {
  @override
  final Iterable<Type> types = const [OrderLines];

  @override
  final String wireName = r'OrderLines';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLines object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
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
    if (object.paidType != null) {
      yield r'paid_type';
      yield serializers.serialize(
        object.paidType,
        specifiedType: const FullType.nullable(OrderLinePaidType),
      );
    }
    if (object.purchaseOrderId != null) {
      yield r'purchase_order_id';
      yield serializers.serialize(
        object.purchaseOrderId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType(num),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(OrderLineStatus),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrderLines object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  OrderLines deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($OrderLines)) as $OrderLines;
  }
}

/// a concrete implementation of [OrderLines], since [OrderLines] is not instantiable
@BuiltValue(instantiable: true)
abstract class $OrderLines implements OrderLines, Built<$OrderLines, $OrderLinesBuilder> {
  $OrderLines._();

  factory $OrderLines([void Function($OrderLinesBuilder)? updates]) = _$$OrderLines;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($OrderLinesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$OrderLines> get serializer => _$$OrderLinesSerializer();
}

class _$$OrderLinesSerializer implements PrimitiveSerializer<$OrderLines> {
  @override
  final Iterable<Type> types = const [$OrderLines, _$$OrderLines];

  @override
  final String wireName = r'$OrderLines';

  @override
  Object serialize(
    Serializers serializers,
    $OrderLines object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(OrderLines))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLinesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'budget':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.budget = valueDes;
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
        case r'paid_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrderLinePaidType),
          ) as OrderLinePaidType?;
          if (valueDes == null) continue;
          result.paidType = valueDes;
          break;
        case r'purchase_order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.purchaseOrderId = valueDes;
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.startTime = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OrderLineStatus),
          ) as OrderLineStatus;
          result.status = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $OrderLines deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $OrderLinesBuilder();
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

