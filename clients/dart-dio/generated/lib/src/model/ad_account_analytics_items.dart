//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_analytics_items.g.dart';

/// AdAccountAnalyticsItems
///
/// Properties:
/// * [AD_ACCOUNT_ID] 
/// * [DATE] 
@BuiltValue()
abstract class AdAccountAnalyticsItems implements Built<AdAccountAnalyticsItems, AdAccountAnalyticsItemsBuilder> {
  @BuiltValueField(wireName: r'AD_ACCOUNT_ID')
  String get AD_ACCOUNT_ID;

  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  AdAccountAnalyticsItems._();

  factory AdAccountAnalyticsItems([void updates(AdAccountAnalyticsItemsBuilder b)]) = _$AdAccountAnalyticsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountAnalyticsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountAnalyticsItems> get serializer => _$AdAccountAnalyticsItemsSerializer();
}

class _$AdAccountAnalyticsItemsSerializer implements PrimitiveSerializer<AdAccountAnalyticsItems> {
  @override
  final Iterable<Type> types = const [AdAccountAnalyticsItems, _$AdAccountAnalyticsItems];

  @override
  final String wireName = r'AdAccountAnalyticsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountAnalyticsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'AD_ACCOUNT_ID';
    yield serializers.serialize(
      object.AD_ACCOUNT_ID,
      specifiedType: const FullType(String),
    );
    if (object.DATE != null) {
      yield r'DATE';
      yield serializers.serialize(
        object.DATE,
        specifiedType: const FullType(Date),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountAnalyticsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountAnalyticsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AD_ACCOUNT_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.AD_ACCOUNT_ID = valueDes;
          break;
        case r'DATE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.DATE = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccountAnalyticsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountAnalyticsItemsBuilder();
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

