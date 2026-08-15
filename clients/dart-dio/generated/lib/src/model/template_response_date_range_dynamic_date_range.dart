//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'template_response_date_range_dynamic_date_range.g.dart';

/// The dynamic date range of the template
///
/// Properties:
/// * [range] - The dynamic range type
/// * [type] - The date range type
@BuiltValue()
abstract class TemplateResponseDateRangeDynamicDateRange implements Built<TemplateResponseDateRangeDynamicDateRange, TemplateResponseDateRangeDynamicDateRangeBuilder> {
  /// The dynamic range type
  @BuiltValueField(wireName: r'range')
  TemplateResponseDateRangeDynamicDateRangeRangeEnum? get range;
  // enum rangeEnum {  YEAR_TO_DATE,  QUARTER_TO_DATE,  MONTH_TO_DATE,  LAST_MONTH,  LAST_QUARTER,  };

  /// The date range type
  @BuiltValueField(wireName: r'type')
  String? get type;

  TemplateResponseDateRangeDynamicDateRange._();

  factory TemplateResponseDateRangeDynamicDateRange([void updates(TemplateResponseDateRangeDynamicDateRangeBuilder b)]) = _$TemplateResponseDateRangeDynamicDateRange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TemplateResponseDateRangeDynamicDateRangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TemplateResponseDateRangeDynamicDateRange> get serializer => _$TemplateResponseDateRangeDynamicDateRangeSerializer();
}

class _$TemplateResponseDateRangeDynamicDateRangeSerializer implements PrimitiveSerializer<TemplateResponseDateRangeDynamicDateRange> {
  @override
  final Iterable<Type> types = const [TemplateResponseDateRangeDynamicDateRange, _$TemplateResponseDateRangeDynamicDateRange];

  @override
  final String wireName = r'TemplateResponseDateRangeDynamicDateRange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TemplateResponseDateRangeDynamicDateRange object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.range != null) {
      yield r'range';
      yield serializers.serialize(
        object.range,
        specifiedType: const FullType(TemplateResponseDateRangeDynamicDateRangeRangeEnum),
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
    TemplateResponseDateRangeDynamicDateRange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TemplateResponseDateRangeDynamicDateRangeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'range':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TemplateResponseDateRangeDynamicDateRangeRangeEnum),
          ) as TemplateResponseDateRangeDynamicDateRangeRangeEnum;
          result.range = valueDes;
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
  TemplateResponseDateRangeDynamicDateRange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TemplateResponseDateRangeDynamicDateRangeBuilder();
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

class TemplateResponseDateRangeDynamicDateRangeRangeEnum extends EnumClass {

  /// The dynamic range type
  @BuiltValueEnumConst(wireName: r'YEAR_TO_DATE')
  static const TemplateResponseDateRangeDynamicDateRangeRangeEnum YEAR_TO_DATE = _$templateResponseDateRangeDynamicDateRangeRangeEnum_YEAR_TO_DATE;
  /// The dynamic range type
  @BuiltValueEnumConst(wireName: r'QUARTER_TO_DATE')
  static const TemplateResponseDateRangeDynamicDateRangeRangeEnum QUARTER_TO_DATE = _$templateResponseDateRangeDynamicDateRangeRangeEnum_QUARTER_TO_DATE;
  /// The dynamic range type
  @BuiltValueEnumConst(wireName: r'MONTH_TO_DATE')
  static const TemplateResponseDateRangeDynamicDateRangeRangeEnum MONTH_TO_DATE = _$templateResponseDateRangeDynamicDateRangeRangeEnum_MONTH_TO_DATE;
  /// The dynamic range type
  @BuiltValueEnumConst(wireName: r'LAST_MONTH')
  static const TemplateResponseDateRangeDynamicDateRangeRangeEnum LAST_MONTH = _$templateResponseDateRangeDynamicDateRangeRangeEnum_LAST_MONTH;
  /// The dynamic range type
  @BuiltValueEnumConst(wireName: r'LAST_QUARTER')
  static const TemplateResponseDateRangeDynamicDateRangeRangeEnum LAST_QUARTER = _$templateResponseDateRangeDynamicDateRangeRangeEnum_LAST_QUARTER;

  static Serializer<TemplateResponseDateRangeDynamicDateRangeRangeEnum> get serializer => _$templateResponseDateRangeDynamicDateRangeRangeEnumSerializer;

  const TemplateResponseDateRangeDynamicDateRangeRangeEnum._(String name): super(name);

  static BuiltSet<TemplateResponseDateRangeDynamicDateRangeRangeEnum> get values => _$templateResponseDateRangeDynamicDateRangeRangeEnumValues;
  static TemplateResponseDateRangeDynamicDateRangeRangeEnum valueOf(String name) => _$templateResponseDateRangeDynamicDateRangeRangeEnumValueOf(name);
}

