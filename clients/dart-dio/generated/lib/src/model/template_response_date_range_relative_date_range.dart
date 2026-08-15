//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'template_response_date_range_relative_date_range.g.dart';

/// The relative date range of the template
///
/// Properties:
/// * [endDaysInPast] - The end date of the date range
/// * [startDaysInPast] - The start date of the date range
/// * [type] - The date range type
@BuiltValue()
abstract class TemplateResponseDateRangeRelativeDateRange implements Built<TemplateResponseDateRangeRelativeDateRange, TemplateResponseDateRangeRelativeDateRangeBuilder> {
  /// The end date of the date range
  @BuiltValueField(wireName: r'end_days_in_past')
  num? get endDaysInPast;

  /// The start date of the date range
  @BuiltValueField(wireName: r'start_days_in_past')
  num? get startDaysInPast;

  /// The date range type
  @BuiltValueField(wireName: r'type')
  String? get type;

  TemplateResponseDateRangeRelativeDateRange._();

  factory TemplateResponseDateRangeRelativeDateRange([void updates(TemplateResponseDateRangeRelativeDateRangeBuilder b)]) = _$TemplateResponseDateRangeRelativeDateRange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TemplateResponseDateRangeRelativeDateRangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TemplateResponseDateRangeRelativeDateRange> get serializer => _$TemplateResponseDateRangeRelativeDateRangeSerializer();
}

class _$TemplateResponseDateRangeRelativeDateRangeSerializer implements PrimitiveSerializer<TemplateResponseDateRangeRelativeDateRange> {
  @override
  final Iterable<Type> types = const [TemplateResponseDateRangeRelativeDateRange, _$TemplateResponseDateRangeRelativeDateRange];

  @override
  final String wireName = r'TemplateResponseDateRangeRelativeDateRange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TemplateResponseDateRangeRelativeDateRange object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.endDaysInPast != null) {
      yield r'end_days_in_past';
      yield serializers.serialize(
        object.endDaysInPast,
        specifiedType: const FullType(num),
      );
    }
    if (object.startDaysInPast != null) {
      yield r'start_days_in_past';
      yield serializers.serialize(
        object.startDaysInPast,
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
    TemplateResponseDateRangeRelativeDateRange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TemplateResponseDateRangeRelativeDateRangeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'end_days_in_past':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.endDaysInPast = valueDes;
          break;
        case r'start_days_in_past':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.startDaysInPast = valueDes;
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
  TemplateResponseDateRangeRelativeDateRange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TemplateResponseDateRangeRelativeDateRangeBuilder();
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

