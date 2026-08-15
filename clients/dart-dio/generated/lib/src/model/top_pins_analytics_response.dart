//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/top_pins_analytics_response_pins_inner.dart';
import 'package:openapi/src/model/top_pins_analytics_response_date_availability.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_pins_analytics_response.g.dart';

/// TopPinsAnalyticsResponse
///
/// Properties:
/// * [dateAvailability] 
/// * [pins] 
/// * [sortBy] 
@BuiltValue()
abstract class TopPinsAnalyticsResponse implements Built<TopPinsAnalyticsResponse, TopPinsAnalyticsResponseBuilder> {
  @BuiltValueField(wireName: r'date_availability')
  TopPinsAnalyticsResponseDateAvailability? get dateAvailability;

  @BuiltValueField(wireName: r'pins')
  BuiltList<TopPinsAnalyticsResponsePinsInner>? get pins;

  @BuiltValueField(wireName: r'sort_by')
  TopPinsAnalyticsResponseSortByEnum? get sortBy;
  // enum sortByEnum {  ENGAGEMENT,  SAVE,  IMPRESSION,  OUTBOUND_CLICK,  PIN_CLICK,  };

  TopPinsAnalyticsResponse._();

  factory TopPinsAnalyticsResponse([void updates(TopPinsAnalyticsResponseBuilder b)]) = _$TopPinsAnalyticsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TopPinsAnalyticsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TopPinsAnalyticsResponse> get serializer => _$TopPinsAnalyticsResponseSerializer();
}

class _$TopPinsAnalyticsResponseSerializer implements PrimitiveSerializer<TopPinsAnalyticsResponse> {
  @override
  final Iterable<Type> types = const [TopPinsAnalyticsResponse, _$TopPinsAnalyticsResponse];

  @override
  final String wireName = r'TopPinsAnalyticsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TopPinsAnalyticsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dateAvailability != null) {
      yield r'date_availability';
      yield serializers.serialize(
        object.dateAvailability,
        specifiedType: const FullType(TopPinsAnalyticsResponseDateAvailability),
      );
    }
    if (object.pins != null) {
      yield r'pins';
      yield serializers.serialize(
        object.pins,
        specifiedType: const FullType(BuiltList, [FullType(TopPinsAnalyticsResponsePinsInner)]),
      );
    }
    if (object.sortBy != null) {
      yield r'sort_by';
      yield serializers.serialize(
        object.sortBy,
        specifiedType: const FullType(TopPinsAnalyticsResponseSortByEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TopPinsAnalyticsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TopPinsAnalyticsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'date_availability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TopPinsAnalyticsResponseDateAvailability),
          ) as TopPinsAnalyticsResponseDateAvailability;
          result.dateAvailability.replace(valueDes);
          break;
        case r'pins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TopPinsAnalyticsResponsePinsInner)]),
          ) as BuiltList<TopPinsAnalyticsResponsePinsInner>;
          result.pins.replace(valueDes);
          break;
        case r'sort_by':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TopPinsAnalyticsResponseSortByEnum),
          ) as TopPinsAnalyticsResponseSortByEnum;
          result.sortBy = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TopPinsAnalyticsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TopPinsAnalyticsResponseBuilder();
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

class TopPinsAnalyticsResponseSortByEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ENGAGEMENT')
  static const TopPinsAnalyticsResponseSortByEnum ENGAGEMENT = _$topPinsAnalyticsResponseSortByEnum_ENGAGEMENT;
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const TopPinsAnalyticsResponseSortByEnum SAVE = _$topPinsAnalyticsResponseSortByEnum_SAVE;
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const TopPinsAnalyticsResponseSortByEnum IMPRESSION = _$topPinsAnalyticsResponseSortByEnum_IMPRESSION;
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const TopPinsAnalyticsResponseSortByEnum OUTBOUND_CLICK = _$topPinsAnalyticsResponseSortByEnum_OUTBOUND_CLICK;
  @BuiltValueEnumConst(wireName: r'PIN_CLICK')
  static const TopPinsAnalyticsResponseSortByEnum PIN_CLICK = _$topPinsAnalyticsResponseSortByEnum_PIN_CLICK;

  static Serializer<TopPinsAnalyticsResponseSortByEnum> get serializer => _$topPinsAnalyticsResponseSortByEnumSerializer;

  const TopPinsAnalyticsResponseSortByEnum._(String name): super(name);

  static BuiltSet<TopPinsAnalyticsResponseSortByEnum> get values => _$topPinsAnalyticsResponseSortByEnumValues;
  static TopPinsAnalyticsResponseSortByEnum valueOf(String name) => _$topPinsAnalyticsResponseSortByEnumValueOf(name);
}

