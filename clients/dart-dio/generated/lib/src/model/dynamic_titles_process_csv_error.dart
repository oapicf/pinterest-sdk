//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dynamic_titles_process_csv_error.g.dart';

/// DynamicTitlesProcessCSVError
///
/// Properties:
/// * [errorType] - The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
/// * [rowNumber] - The row number with a validation error. -1 indicates a file-level error.
@BuiltValue()
abstract class DynamicTitlesProcessCSVError implements Built<DynamicTitlesProcessCSVError, DynamicTitlesProcessCSVErrorBuilder> {
  /// The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
  @BuiltValueField(wireName: r'error_type')
  String? get errorType;

  /// The row number with a validation error. -1 indicates a file-level error.
  @BuiltValueField(wireName: r'row_number')
  int? get rowNumber;

  DynamicTitlesProcessCSVError._();

  factory DynamicTitlesProcessCSVError([void updates(DynamicTitlesProcessCSVErrorBuilder b)]) = _$DynamicTitlesProcessCSVError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DynamicTitlesProcessCSVErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DynamicTitlesProcessCSVError> get serializer => _$DynamicTitlesProcessCSVErrorSerializer();
}

class _$DynamicTitlesProcessCSVErrorSerializer implements PrimitiveSerializer<DynamicTitlesProcessCSVError> {
  @override
  final Iterable<Type> types = const [DynamicTitlesProcessCSVError, _$DynamicTitlesProcessCSVError];

  @override
  final String wireName = r'DynamicTitlesProcessCSVError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DynamicTitlesProcessCSVError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errorType != null) {
      yield r'error_type';
      yield serializers.serialize(
        object.errorType,
        specifiedType: const FullType(String),
      );
    }
    if (object.rowNumber != null) {
      yield r'row_number';
      yield serializers.serialize(
        object.rowNumber,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DynamicTitlesProcessCSVError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DynamicTitlesProcessCSVErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'error_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.errorType = valueDes;
          break;
        case r'row_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.rowNumber = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DynamicTitlesProcessCSVError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DynamicTitlesProcessCSVErrorBuilder();
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

