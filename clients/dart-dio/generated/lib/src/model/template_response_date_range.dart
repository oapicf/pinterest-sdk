//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/template_response_date_range_absolute_date_range.dart';
import 'package:openapi/src/model/template_response_date_range_dynamic_date_range.dart';
import 'package:openapi/src/model/template_response_date_range_relative_date_range.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'template_response_date_range.g.dart';

/// TemplateResponseDateRange
///
/// Properties:
/// * [absoluteDateRange] 
/// * [dynamicDateRange] 
/// * [relativeDateRange] 
@BuiltValue()
abstract class TemplateResponseDateRange implements Built<TemplateResponseDateRange, TemplateResponseDateRangeBuilder> {
  @BuiltValueField(wireName: r'absolute_date_range')
  TemplateResponseDateRangeAbsoluteDateRange? get absoluteDateRange;

  @BuiltValueField(wireName: r'dynamic_date_range')
  TemplateResponseDateRangeDynamicDateRange? get dynamicDateRange;

  @BuiltValueField(wireName: r'relative_date_range')
  TemplateResponseDateRangeRelativeDateRange? get relativeDateRange;

  TemplateResponseDateRange._();

  factory TemplateResponseDateRange([void updates(TemplateResponseDateRangeBuilder b)]) = _$TemplateResponseDateRange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TemplateResponseDateRangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TemplateResponseDateRange> get serializer => _$TemplateResponseDateRangeSerializer();
}

class _$TemplateResponseDateRangeSerializer implements PrimitiveSerializer<TemplateResponseDateRange> {
  @override
  final Iterable<Type> types = const [TemplateResponseDateRange, _$TemplateResponseDateRange];

  @override
  final String wireName = r'TemplateResponseDateRange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TemplateResponseDateRange object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.absoluteDateRange != null) {
      yield r'absolute_date_range';
      yield serializers.serialize(
        object.absoluteDateRange,
        specifiedType: const FullType.nullable(TemplateResponseDateRangeAbsoluteDateRange),
      );
    }
    if (object.dynamicDateRange != null) {
      yield r'dynamic_date_range';
      yield serializers.serialize(
        object.dynamicDateRange,
        specifiedType: const FullType.nullable(TemplateResponseDateRangeDynamicDateRange),
      );
    }
    if (object.relativeDateRange != null) {
      yield r'relative_date_range';
      yield serializers.serialize(
        object.relativeDateRange,
        specifiedType: const FullType.nullable(TemplateResponseDateRangeRelativeDateRange),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TemplateResponseDateRange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TemplateResponseDateRangeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'absolute_date_range':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TemplateResponseDateRangeAbsoluteDateRange),
          ) as TemplateResponseDateRangeAbsoluteDateRange?;
          if (valueDes == null) continue;
          result.absoluteDateRange.replace(valueDes);
          break;
        case r'dynamic_date_range':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TemplateResponseDateRangeDynamicDateRange),
          ) as TemplateResponseDateRangeDynamicDateRange?;
          if (valueDes == null) continue;
          result.dynamicDateRange.replace(valueDes);
          break;
        case r'relative_date_range':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TemplateResponseDateRangeRelativeDateRange),
          ) as TemplateResponseDateRangeRelativeDateRange?;
          if (valueDes == null) continue;
          result.relativeDateRange.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TemplateResponseDateRange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TemplateResponseDateRangeBuilder();
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

