//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'template_response_date_range_absolute_date_range.g.dart';

/// The absolute date range of the template
///
/// Properties:
/// * [endDate] - The end date of the date range
/// * [startDate] - The start date of the date range
/// * [type] - The date range type
@BuiltValue()
abstract class TemplateResponseDateRangeAbsoluteDateRange implements Built<TemplateResponseDateRangeAbsoluteDateRange, TemplateResponseDateRangeAbsoluteDateRangeBuilder> {
  /// The end date of the date range
  @BuiltValueField(wireName: r'end_date')
  num? get endDate;

  /// The start date of the date range
  @BuiltValueField(wireName: r'start_date')
  num? get startDate;

  /// The date range type
  @BuiltValueField(wireName: r'type')
  String? get type;

  TemplateResponseDateRangeAbsoluteDateRange._();

  factory TemplateResponseDateRangeAbsoluteDateRange([void updates(TemplateResponseDateRangeAbsoluteDateRangeBuilder b)]) = _$TemplateResponseDateRangeAbsoluteDateRange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TemplateResponseDateRangeAbsoluteDateRangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TemplateResponseDateRangeAbsoluteDateRange> get serializer => _$TemplateResponseDateRangeAbsoluteDateRangeSerializer();
}

class _$TemplateResponseDateRangeAbsoluteDateRangeSerializer implements PrimitiveSerializer<TemplateResponseDateRangeAbsoluteDateRange> {
  @override
  final Iterable<Type> types = const [TemplateResponseDateRangeAbsoluteDateRange, _$TemplateResponseDateRangeAbsoluteDateRange];

  @override
  final String wireName = r'TemplateResponseDateRangeAbsoluteDateRange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TemplateResponseDateRangeAbsoluteDateRange object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.endDate != null) {
      yield r'end_date';
      yield serializers.serialize(
        object.endDate,
        specifiedType: const FullType(num),
      );
    }
    if (object.startDate != null) {
      yield r'start_date';
      yield serializers.serialize(
        object.startDate,
        specifiedType: const FullType(num),
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
    TemplateResponseDateRangeAbsoluteDateRange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TemplateResponseDateRangeAbsoluteDateRangeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.endDate = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.startDate = valueDes;
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
  TemplateResponseDateRangeAbsoluteDateRange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TemplateResponseDateRangeAbsoluteDateRangeBuilder();
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

